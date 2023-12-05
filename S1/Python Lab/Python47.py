#write a program to remove all strings with length <5 from a list of strings 

s = input("Enter a list of string :")

l=list(filter(lambda x:len(x)>5,s.split()))

print(l)