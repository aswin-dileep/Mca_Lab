#Generate a list of numbers by removing even numbers from a given list
numbers =[1,2,3,4,5,6,7,8,9]
print("The given list is ",numbers)
oddNumbers =[]
for number in numbers:
    if number %2!=0:
        oddNumbers.append(number)

print("\n The new list after removingeven numbers",oddNumbers)