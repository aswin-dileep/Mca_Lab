#write a program to accept a sentence from user and display the total (amount)
#count of vowels in a sentence

a=input("Enter a sentence :")

count =0

for i in a:
    if i.lower() in 'aeiou':
        count +=1

print("Number of vowels :",count)