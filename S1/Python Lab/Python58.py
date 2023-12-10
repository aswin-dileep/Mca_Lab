#find the lengthiest lines in a file

inf = False
try:
    inf = open('abc.txt')
    lines = inf.readlines()
    lines.sort(key=len,reverse=True)
    print(lines[0])
except IOError as e:
    print(e)

finally :
    if inf: inf.close()


