#copy one file to another 

inf = False

infile = False

try:
    with open('abc.txt','r') as inf,open('xyz.txt','a') as infile:
        for line in inf:
            infile.write(line)
        print('copied')
except IOError as e:
    print(e)

finally:
     if inf:inf.close()
     if infile:infile.close()


