#Accept all list of integers from ser for all values above 100 store the string 'over'
#in the specific position

a = list(map(int,input("Enter list of numbers :").split()))
         
for i in range(len(a)):
    if a[i]>100:
        a[i] ='over'

print(a)