#find the sum of first N whole numbers 

def sum_n(n):
    if not n:
        return 0
    else:
        return n+sum_n(n-1)

n= int(input("Enter the number :"))
print('sum =',sum_n(n))    