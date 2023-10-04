#create a list of names and count the number of names that start with 'a'

names = ["Aswin","Anoop","Ajai","Yadhu"]

print("The List of name is :",names)
result =[]
for name in names:
    if(name[0].lower()=='a'):
        result.append(name)

print("The list of names Starting with 'a' is ",result)