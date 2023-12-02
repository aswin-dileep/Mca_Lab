#write a function that count the number of strings where string 
#length is 2 or more and the first and last character are same

def count_string(s):
    count =0
    for string in s:
        if( len(string)>=2 and string[0]==string[-1]):
            count = count+1
    print(count)
strings = input("Enter the collections of strings :")

strings = list(map(str,strings.split()))

count_string(strings)