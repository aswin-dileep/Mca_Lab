#program to accept a list of numbers seperated by comma and print the numbers that are even 

num = input("Enter numbers :")
numList = num.split(',')
even =[i for i in numList if int(i)%2==0]
print("The even numbers are ",even)