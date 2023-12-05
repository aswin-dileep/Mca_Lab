#write a program to reverse a string

def reverse(s):
    if not len(s):
        return s
    else:
        return s[-1]+reverse(s[:-1])
    
s = input("Enter a string to reverse :")

print("reversed string is :",reverse(s))