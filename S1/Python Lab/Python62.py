#write a program that accept an integer from user and raise value
#error with argument Abnormal condition if the reading is not with in 90-120

try:
    num = int(input("Enter a number :"))
    if num<=90 or num >=120:
        raise ValueError("Abnormal condition")
    print(num)
except ValueError as e:
    print(e)