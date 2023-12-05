#generate list of numbers which is numbers even and perfect square

def digits_even(num):
    flag=0
    while num>0:
        d=num%10
        if d%2:
            flag=1
            break
        num =num//10
    if(flag==1) : return False
    else : return True

def perfect_square(num):
    flag=0
    for i in range(1,num//2+1):
        if i*i==num:
            flag=1
            break
    if(flag==1):return True
    else : return False

lower = int(input("Enter lower limit "))
upper = int(input("Enter upper limit "))

print("Number between ",lower," and ",upper," is ",end="")

for i in range(lower,upper+1):
    if digits_even(i) and perfect_square(i):
        print(i,end=" ")