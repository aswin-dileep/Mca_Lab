#Create a package araphics with modules rectangle and circle with methods
#to findarea and perimeter of respective figures in each sphere with methods to find area
#find area perimeter of figures by different importing statements

from graphics.circle import *
from graphics import rectangle,circle
from graphics.dgraphics import cuboid,sphere

l = int(input("Enter the length of rectangle :"))
b=int(input("Enter the breadth of rectangle :"))
c=int(input("Enter the height of cuboid :"))
r=int(input("Enter the readius :"))

rectangle.area(1,6)
rectangle.perimeter(1,6)
cuboid.area(l,b,h)
cuboid.volume(l,b,h)
circle.area(r)
circle.perimeter(r)
sphere.area(r)
sphere.volume(r)
