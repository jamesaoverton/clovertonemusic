#!/usr/bin/env python3

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
  if len(args) != 2:
    print("Usage: {} <Input JSON file> <Output CSV file>"
          .format(basename(__file__)), file=sys.stderr)
    sys.exit(1)

  try:
    input("\nWARNING. This will overwrite all existing users. If you are\n"
          "sure you want to continue, press Enter; otherwise press Ctrl-C.\n")
  except KeyboardInterrupt:
    print("\nOkee dokee.")
    sys.exit(1)

  with open(args[0]) as json_in, open(args[1], 'w') as csv_out:
    data = json.load(json_in)
    writer = csv.writer(csv_out, lineterminator='\n', delimiter=',')
    writer.writerow(['userid', 'lastaccessed', 'dateadded', 'password', 'name', 'band', 'city',
                     'province', 'country', 'phone', 'email', 'newsletter', 'activationid',
                     'resetpwid'])
    print("Creating user records for pre-existing users in the CSV file ...")
    time.sleep(1)
    for entry in data:
      writer.writerow([entry['id'], None, None, None, entry['name'], entry['band'], entry['city'],
                       translate(entry['province'], province_alias_map),
                       translate(entry['country'], country_alias_map),
                       None, entry['email'], entry['newsletter'], None, None])

  try:
    input("\nExisting users have been migrated to the new CSV file. Their\n"
          "passwords must now be reset. Before doing so, the clovertone server\n"
          "must be restarted so as to read in the new records. Please do that\n"
          "now before continuing on with the script. Upon continuing, this script\n"
          "will send a request to the server to reset each of the migrated users'\n"
          "passwords, which will generate an email to each user containing a link to\n"
          "complete the password reset. Press enter when ready or Ctrl-C to abort.\n")
  except KeyboardInterrupt:
    print("\nOkee dokee.")
    sys.exit(1)

  with open (args[1]) as csv_in:
    users = list(csv.DictReader(csv_in))
    for user in users:
      print("Requesting password reset for user {}".format(user['userid']))
      r = requests.post(clovertone_server + "/forgotpw/",
                        data={'is-migration': True, 'email': user['email']})
      if r.status_code != requests.codes.ok:
        print("WARNING: Problem generating a reset password request for user '{}'. Status code: {}"
              .format(user['email'], r.status_code))

if __name__ == "__main__":
  main(sys.argv[1:])
