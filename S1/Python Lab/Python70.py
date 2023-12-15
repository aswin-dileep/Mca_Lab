#write a python program to writing to a csv file
import csv

fields=['Name','Place','Age']
rows=[['Aswin','Amsterdam',24],['Anoop','London',25]]
with open('file.csv','w') as f:
    writer=csv.writer(f)
    writer.writerow(fields)
    writer.writerows(rows)
    f.close()
