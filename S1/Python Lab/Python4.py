#Create a word from given string by exchanging first and last charaters 
string = input("Enter the String :")

replaceString = string[-1]+string[1:-1]+string[0]

print("String After Replacing :",replaceString)