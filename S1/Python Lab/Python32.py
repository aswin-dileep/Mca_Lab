#Write a program to generate a string by combining 1st two characters and last two characters from an
#  input string .if the length input string is 2 . then the resultant string must be an concatenation 
# of those characters or if the length is less than 2, return an empty string instead 

s = input("Enter a String ")
res ="" 
if len(s) ==2:
    res = S*2
elif len(s)>2:
    res = s[:2]+s[-2:]

print(res)