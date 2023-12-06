#write 3 lambda functions each to find area of square , rectangle and triangle

square = lambda x:x*x
rectangle =lambda l,b :l*b
triangle = lambda b,h:0.5*b*h

a = int(input("Enter the side length of the square :"))
b = int(input("Enter the length of the rectangle"))
c = int(input("Enter the breadth of the rectangle :"))
d = int(input("Enter the base length of the triangle :"))
e = int(input("Enter the height of the triangle :"))

print("Area of the square =",square(a))
print("Area of the rectangle =",rectangle(b,c))
print("Area of the triangle =",triangle(d,e))

