#find the longest word words in a file 

#longest word in a file

inputfile=False
try:
    inputfile=open("abc.txt")
    inputf=list(set(inputfile.read().split()))
    inputf.sort(key=len,reverse=True)
    print("\nLongest word(s)\n")
    for i in inputf:
        if len(i)==len(inputf[0]):
            print(i)
    
    
        
except Exception as e:
    print(e)
finally:
    if inputfile:inputfile.close()