#write a function to print all even no from a given list in the given order
# until you read number 237 or end of the list

def even_collection(l):
    for item in l:
        if(item==237):
            break
        elif not item%2:
            print(item,end=" ")

numbers = input("Enter the collection of numbers :")
numbers = list(map(int,numbers.split()))

even_collection(numbers)