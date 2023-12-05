#write a program to increment a list of integers of by 10% 
#if the number is generated greater than 1000 else by 5% program

s=[2,3,6,8]

l=list(map(lambda x:x+x*0.01 if x>1000 else x+x*0.05,s))

print(l)