#Accept a list of words and a number n print the word that are longer than n

words = input("Enter the words :")
wordList = words.split()
num =int(input("Enter the number :"))

for word in wordList:
    if len(word)>num:
        print(word)