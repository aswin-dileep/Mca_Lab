#Create a single string separated by commas with space from two strings by swapping the 
#Character at position One 
String1 = input("Enter the first String :")
String2 = input("Enter the second String :")
newString = String2[0]+String1[1:]+" "+String1[0]+String2[1:]

print(newString)