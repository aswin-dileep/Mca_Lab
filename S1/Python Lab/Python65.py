#create Rectangle class with attributes length and breadth and meathods to find area and perimeter.
#compare two rectangle objects by their area

class Rectangle:
    def __init__(self,l=0,b=0):
        self.l=l
        self.b=b
        self.a=l*b

    def area(self):
        self.a = self.l*self.b
        return self.a
    
    def perimeter(self):
        p =2*(self.l+self.b)
        return p

    def __eq__(self,other):
        if(self.a==other.a):
            print("Same area")
        else:
            print("Not same area ")

r1=Rectangle(5,10)
r2=Rectangle(50,2)
print("area of r1 =",r1.area())
print("Area of r2 =",r2.area())
print("perimeter of r1 = ",r1.perimeter())
print("perimeter of r2 =",r2.perimeter())
