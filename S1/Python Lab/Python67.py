#create a class rectangle with private attributes length & width
#Overload  '&' Operator , to compare the area of 2 rectangles

class Rectangle:
    def __init__(self,l=0,w=0):
        self.l=l
        self.w=w
        self.a=l*w
    def __gt__(self,other):
        if self.a<other.a:
            return True
        else :
            return False

r1=Rectangle(10,20)
r2=Rectangle(40,2)

print(r1>r2)

