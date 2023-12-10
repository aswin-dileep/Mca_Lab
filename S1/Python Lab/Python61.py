#copy odd lines in a file to another

inf = False
outf= False

try:
    inf = open('inf.txt')
    print("Inpt file")
    print(inf.read())
    inf.seek(0,0)
    line = inf.readlines()
    outf = open("outf.text","w+")
    outf.writelines(line[0::2])
    outf.seek(0,0)
    print("\n Output file")
    print(outf.read())
except IOError as e:
    print(e)

finally:
    if inf:inf.close()
    if outf:outf.close()
