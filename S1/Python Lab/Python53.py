#write a program to search an item in a given list and display the number of occurance of the given item

a=list(map(int,input("Enter list of number :").split()))

b = int(input("Enter item to be search :"))

i=count =0

while i<len(a):
    if a[i]==b:
        count+=1
    i+=1
if count ==0:
    print("Item not found")
else:
    print("Item found ",count," times")