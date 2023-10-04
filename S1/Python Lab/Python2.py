#Program to Create a string from an input string where all occurrence of the first character replaced with 
# '&' except first character

string= input("Enter the String :")

a = string[0]

newString = a+string[1:].replace(a,'&')

print(newString)