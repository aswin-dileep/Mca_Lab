#write a program to accept a string and return the length of 
#longest word. if the result has more than one word then print 'BINGO'

s = input("Enter a line of string :").split()

r =[x for x in s if len(x)==len(max(s,key=len))]

if len(r)>1:
    print("B I N G O")



