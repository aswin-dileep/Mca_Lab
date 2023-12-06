#write a program that print number from 1 to 20 for every multiple of 3
#print 'fizz' for every multiple of 5 print 'Buzz' and for every multiple of both 3 and 5 print
#'Fizz Buzz' instead of the original number 

for i in range(1,21):
    if i%3==0 and i%5==0:
        print("Fizz Buzz")
    elif i%5==0:
        print("Buzz")
    elif i%3==0:
        print("Fizz")
    else:
        print(i)