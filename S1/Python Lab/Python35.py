#write a function that accepts fullname display the reverse order of words with space between them 

def rev_name(name):
    
    fullname =name.split()

    fullname = " ".join(reversed(fullname))
    print(fullname)

n = input("Enter full name :")

rev_name(n)