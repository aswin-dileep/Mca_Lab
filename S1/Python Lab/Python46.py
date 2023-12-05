#write a program to check whether the input is divisible by 5

a =int(input("Enter the number :"))

divisible = lambda a:a % 5==0
print(divisible(a))