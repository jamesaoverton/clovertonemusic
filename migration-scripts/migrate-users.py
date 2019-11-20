#!/usr/bin/env python3

import argparse
import csv
import json
import requests
import sys
import time
from os.path import basename

clovertone_server = "http://localhost:8090"

country_alias_map = {'Canada': ['CA', 'CAN'],
                     'USA': ['US', 'United States of America', 'United States', 'U.S.A']}

province_alias_map = {'Prince Edward Island': ['PE', 'PEI'],
                      'Nova Scotia': ['NS'],
                      'Alberta': ['AB'],
                      'British Columbia': ['BC'],
                      'Manitoba': ['MB'],
                      'New Brunswick': ['NB'],
                      'Newfoundland and Labrador': ['NL'],
                      'Nunavut': ['NU'],
                      'Northwest Territories': ['NT', 'NWT'],
                      'Yukon': ['YT'],
                      'Quebec': ['QC', 'QUE', 'PQ'],
                      'Saskatchewan': ['SK'],
                      'Ontario': ['ON', 'ONT'],
                      'Minnesota': ['MN'],
                      'Massachusetts': ['MA'],
                      'Puerto Rico': ['PR'],
                      'Utah': ['UT'],
                      'Washington': ['WA'],
                      'Idaho': ['ID'],
                      'Montana': ['MT'],
                      'Texas': ['TX'],
                      'Alaska': ['AK'],
                      'Alabama': ['AL'],
                      'Vermont': ['VT'],
                      'Iowa': ['IA'],
                      'Maryland': ['MD'],
                      'Maine': ['ME'],
                      'Kentucky': ['KY'],
                      'California': ['CA'],
                      'Tennessee': ['TN'],
                      'West Virginia': ['WV'],
                      'Missouri': ['MO'],
                      'New Jersey': ['NJ'],
                      'Colorado': ['CO'],
                      'Georgia': ['GA'],
                      'Connecticut': ['CT'],
                      'District of Columbia': ['DC'],
                      'South Dakota': ['SD'],
                      'Wisconsin': ['WI'],
                      'Wyoming': ['WY'],
                      'Michigan': ['MI'],
                      'Virgin Islands': ['VI'],
                      'North Dakota': ['ND'],
                      'Nebraska': ['NE'],
                      'Oregon': ['OR'],
                      'Kansas': ['KS'],
                      'New York': ['NY'],
                      'Oklahoma': ['OK'],
                      'Arkansas': ['AR'],
                      'Guam': ['GU'],
                      'Mississippi': ['MS'],
                      'Delaware': ['DE'],
                      'Virginia': ['VA'],
                      'Ohio': ['OH'],
                      'Arizona': ['AZ'],
                      'Illinois': ['IL'],
                      'Northern Mariana Islands': ['MP'],
                      'American Samoa': ['AS'],
                      'Rhode Island': ['RI'],
                      'South Carolina': ['SC'],
                      'Louisiana': ['LA'],
                      'National': ['NA'],
                      'New Mexico': ['NM'],
                      'Nevada': ['NV'],
                      'Pennsylvania': ['PA'],
                      'North Carolina': ['NC'],
                      'New Hampshire': ['NH'],
                      'Indiana': ['IN'],
                      'Florida': ['FL'],
                      'Hawaii': ['HI']}

def translate(record, translation_map):
  for pkey in translation_map:
    if record.casefold() == pkey.casefold() or (
        record.casefold() in [alias.casefold() for alias in translation_map[pkey]]):
      return pkey

  return record.title()

def main(args=[]):
  parser = argparse.ArgumentParser(
    description="Script to migrate Clovertone users to the new system")

  group = parser.add_mutually_exclusive_group(required=True)
  group.add_argument('--generate_csv', action="store_true")
  group.add_argument('--reset_passwords', action="store_true")

  parser.add_argument('--input_json', metavar='JSON',
                      help='input JSON file, required when --generate_csv is specified')
  parser.add_argument('--output_csv', metavar='CSV',
                      help='output CSV file, required when --generate_csv is specified')
  parser.add_argument('--input_csv', metavar='CSV',
                      help='input CSV file; required when --reset_passwords is specified')

  args = parser.parse_args()

  if args.generate_csv:
    if (not args.input_json or not args.output_csv) or \
       args.input_csv:
      parser.parse_args(['-h'])
      sys.exit(1)

    with open(args.input_json) as json_in, open(args.output_csv, 'w') as csv_out:
      data = json.load(json_in)
      writer = csv.writer(csv_out, lineterminator='\n', delimiter=',')
      writer.writerow(['userid', 'lastaccessed', 'dateadded', 'password', 'name', 'band', 'city',
                       'province', 'country', 'phone', 'email', 'newsletter', 'activationid',
                       'resetpwid'])
      time.sleep(1)
      for entry in data:
        writer.writerow([entry['id'], "", "", "", entry['name'], entry['band'], entry['city'],
                         translate(entry['province'], province_alias_map),
                         translate(entry['country'], country_alias_map),
                         "", entry['email'], entry['newsletter'], "", ""])

      print("\nThe users in {json} have been added to {csv}.\n\n"
            "You must now manually copy the data from {csv} to the 'users' worksheet of the\n"
            "ClovertoneMusicUsersAndPurchases workbook in your Google Drive. You should remove\n"
            "any existing entries from that worksheet before copying.\n\n"
            "Once you have copied the users, restart the clovertone server, then re-run this\n"
            "script, this time with the --reset_passwords flag.\n\n"
            "Note: Do not delete {csv} as it is needed for the reset passwords step. Its location\n"
            "should be specified using the --input_csv parameter.\n"
            .format(json=args.input_json, csv=args.output_csv))
      sys.exit(0)
  elif args.reset_passwords:
    if not args.input_csv or (args.input_json or args.output_csv):
      parser.parse_args(['-h'])
      sys.exit(1)

    try:
      input("\nUpon running this script, a request will be sent to the server to reset the\n"
            "password of every user in the users database. If you really want to do this,\n"
            "press enter. Otherwise press Ctrl-C to about.\n")
    except KeyboardInterrupt:
      print("\nOkee dokee.")
      sys.exit(1)

    with open (args.input_csv) as csv_in:
      users = list(csv.DictReader(csv_in))
      for user in users:
        print("Requesting password reset for user {}".format(user['userid']))
        r = requests.post(clovertone_server + "/forgotpw/",
                          data={'is-migration': True, 'email': user['email']})
        if r.status_code != requests.codes.ok:
          print("WARNING: Problem generating reset password request for user '{}'. Status code: {}"
                .format(user['email'], r.status_code))

if __name__ == "__main__":
  main(sys.argv[1:])
