#find the second smallest number in a list 

numbers =[4,2,7,1,8,3,9]

for i in range(0,len(numbers)):
    for j in range(i+1,len(numbers)):
        if numbers[i] >= numbers[j]:
            numbers[i],numbers[j]=numbers[j],numbers[i]

print(numbers)