#!/usr/bin/env python3

import csv
import datetime
import json
import os
import sys
import time

purchases_path = "/home/mike/Knocean/clovertonemusic/data/users-and-purchases/purchases"

def guess_purchase_date(token):
  fulldir = purchases_path + "/" + token
  if os.path.exists(fulldir):
    # Note that on Linux getctime() returns the time of the last metadata change. There is no
    # straightforward way to get the file's birth time on Linux, though, and this will suffice
    # for our purposes.
    creation_timestamp = os.path.getctime(fulldir)
    return datetime.datetime.fromtimestamp(creation_timestamp).strftime("%Y-%m-%d")
  else:
    print("WARNING: {} does not exist. Using today's date as the purchase date.".format(fulldir))
    return datetime.datetime.now().strftime("%Y-%m-%d")

def main(args=[]):
  if len(args) != 3:
    print("Usage: {} <Input JSON file> <Purchases CSV output> <Purchases details CSV output>"
          .format(os.path.basename(__file__)), file=sys.stderr)
    sys.exit(1)

  if not os.path.isdir(purchases_path):
    print("{} does not exist".format(purchases_path), file=sys.stderr)
    sys.exit(1)

  with open(args[0]) as js_in, open(args[1], 'w') as summary_out, open(args[2], 'w') as details_out:
    data = json.load(js_in)
    summary_writer = csv.writer(summary_out, lineterminator='\n', delimiter=',')
    details_writer = csv.writer(details_out, lineterminator='\n', delimiter=',')
    print("\nCreating records for pre-existing purchases in the new purchase db ...")
    summary_writer.writerow(['purchaseid', 'userid', 'user_name', 'user_email', 'charts', 'date',
                             'subtotal', 'taxrate', 'taxname', 'taxes', 'total', 'watermark',
                             'stripe-checkout-session-id', 'payment-completed'])
    details_writer.writerow(['purchaseid', 'chart', 'price', 'composer', 'grade', 'subgenre'])

    for entry in data:
      summary_writer.writerow([entry['token'], entry['user'], entry['user_name'],
                               entry['user_email'],
                               ';'.join([cd['filename'] for cd in entry['chart_data']]),
                               guess_purchase_date(entry['token']), entry['subtotal'],
                               format(int(entry['taxrate'] * 100)) + '%',
                               'No Tax' if not entry['taxname'] else entry['taxname'],
                               entry['taxes'], entry['total'], entry['watermark'], "", "true"])
      for chart in entry['chart_data']:
        details_writer.writerow([entry['token'], chart['name'], '${:.2f}'.format(chart['price']),
                                chart['composer'], chart['grade'], chart['genre']])

  time.sleep(1)
  print("\nThe purchases in {json} have been added to {csv1} and {csv2}.\n\n"
        "You must now manually copy the data from {csv1} and {csv2} to the 'purchases-summary'\n"
        "and 'purchases-details' worksheets of the ClovertoneMusicUsersAndPurchases workbook\n"
        "in your Google Drive. You should remove any existing entries from that worksheet before\n"
        "copying.\n\n"
        "Once you have copied the purchases, restart the clovertone server.\n"
        .format(json=args[0], csv1=args[1], csv2=args[2]))

if __name__ == "__main__":
  main(sys.argv[1:])
