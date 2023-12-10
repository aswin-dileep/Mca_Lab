#separate odd and even nos in a file to separate file 

inf = False 
try:
    inf = open('num.txt','r')
    for line in inf:
        if line.strip:
            num = int(line)
            if(num%2==0):
                even = open('even.txt','a')
                even.write(str(num))
                even.write("\n")
            else:
                odd = open('odd.txt','a')
                odd.write(str(num))
                odd.write("\n")
        print("updated")
except IOError as e:
    print(e)

finally:
    if inf : inf.close()

