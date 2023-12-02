#write a program to check whether an item is available in a list and return 'Available' or 'not'
#Available 'appropriately'

l=[1,2,3,4]

item = int (input('Enter the item to be searched :'))

print('Available' if item in l else 'not')