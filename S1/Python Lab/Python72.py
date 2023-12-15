#prython program write a dictionary to a csv file

import csv
# field names
fields=['Name','Age','Place']
# data rows of csv dict file
rows = [ {'Name':'Aswin', 'Age':21, 'Place':'London'},
         {'Name':'Hari','Age':23,'Place': 'California'},
         {'Name':'Anoop','Age':24,'Place': 'Amsterdam'}
         ]
with open('file.csv', 'w') as f:
    writer = csv.DictWriter(f,fieldnames=fields)
    writer.writeheader()
    writer.writerows(rows)
    f.close()
