#write a program to determine frequency of word in a sentence 

words ={}

line ="India is my country I love my country"
for w in line.split():
    words[w]=words.get(w,0)+1

print(words)