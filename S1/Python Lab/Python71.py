#write a python program to read from csv file

import csv

with open('file.csv',mode='r') as file:
    reader = csv.reader(file)
    for row in reader:
        print(row)
        
