#Write a program to demonstrate Assert Error in python for 
#negative input

try:
    num = int(input("Enter any number :"))
    assert num>0,"Error :Negative Input"
    print(num)
except AssertionError as ae:
    print(ae)