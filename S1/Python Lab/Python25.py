#write a program to add 'ing' at the end of the string if already ends with 'ing'
#  then add 'ly'

a = input("Enter a string :")
if a.lower().endswith('ing'):
    a+='ly'
    print(a)
else:
    a+='ing'
    print(a)