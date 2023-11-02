#write a Program to print out are colors 
#from color list 1 not container in color list 2

c1 = set(input("Enter color list_1 :").lower().split())
c2 = set(input("E color list_2 :").lower().split())

print("colours are :",c1-c2)