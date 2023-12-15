#append an existing file with contents accepted the user

inf= False
try:
    inf =open('abc.txt','r+')
    print("Before appending")
    print(inf.read())
    line = input("\n Enter the text to be appended \n")
    inf.write('\n'+line)
    inf.seek(0,0)
    print('\n After appending')
    print(inf.read())
except IOError as e:
    print(e)
finally:
    if inf:inf.close()