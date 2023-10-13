#Accept a string and check whether it is a palindrome or not 

str = input("Enter a string :")
str = str.casefold()
rev_str =reversed(str)
if list(str) == list(rev_str):
    print("\n The string is palindrome")
else:
    print("\n The string is not a palindrome")