#form a list containing vowels from a given word
word = input("Enter a word :")
L = list(word)
vowels =["a","e","i","o","u"]
result =[]
for letter in word:
    if letter.lower() in vowels:result.append(letter)

print("The given word is ",word)
print("The list of vowels in the word is ",result)
