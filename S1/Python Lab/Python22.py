#write a program to determine frequency of alphabts in a word 

lettles ={}

word = "suspicious"

for l in word:
    lettles[l] = lettles.get(l,0)+1

print(lettles)