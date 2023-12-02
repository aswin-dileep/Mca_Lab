#write a program to find the sum of elements in a list

def sum(seq):
    if len(seq)==1:
        return seq[0]
    else:
        return seq[0] +sum(seq[1:])
    
l=[5,10,15,20,25]

print("The sum of Elements in list is ",sum(l))