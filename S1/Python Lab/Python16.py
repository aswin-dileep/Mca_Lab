#Accept a list of numbers seperated by space and find the maximum and minimum element 

num = input("Enter numbers :")
numList = num.split()
large =numList[0]
small =numList[0]
for i in numList:
    if int(i)>int(large):
        large =i
    if int(i)<int(small):
        small =i

print("The maximum number is ",large)
print("The minimum number is ",small)