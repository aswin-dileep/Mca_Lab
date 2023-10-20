#find the second smallest number in a list 

numbers =[23,56,-1,0,-99,101,-4]

for i in range(0,len(numbers)):
    for j in range(i+1,len(numbers)):
        if numbers[i] >= numbers[j]:
            numbers[i],numbers[j]=numbers[j],numbers[i]

print(numbers)