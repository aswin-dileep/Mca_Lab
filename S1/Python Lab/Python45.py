#write a program to find the largest os two numbers usuing lambda function

a=int(input("Enter the first number :"))
b=int(input("Enter the second number :"))

large = lambda a,b:a if a>b else b

print(large(a,b))