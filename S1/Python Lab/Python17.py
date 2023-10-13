#write a program to remove duplicate elements form a given list

numList =[4,6,2,4,7,8,2,1]
newList =[]

for i in numList:
    if i not in newList:
        newList.append(i)

print("Original list ",numList)
print("list after removing duplicate elements ",newList)
