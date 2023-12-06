#write a function to get a new string from agiven string by adding 'ls' to the beginning of the input string . if 
#the given string already begins with 'ls' return the input string unchanged 

def add(a):
    if a.startswith('s'):
        return a
    else :
        return 'ls'+a
    
s = input("Enter string :")

print(add(s))
