//create an interface having prototypes of functions area() and perimeter().create two class and perimeter() which implements the above interface.
//Create a menu driven program to find area and perimeter of objects

import java.util.Scanner;

interface Measurement{
    void area();
    void perimeter();
    void input();
}
class circle implements Measurement{
    int r;
    public void input(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter radius");
        r=s.nextInt();
        area();
        perimeter();
    }
    public void area(){
        System.out.println("Areae of circle "+3.14*r*r);
    }
    public void perimeter(){
        System.out.println("Perimeter of Circle :"+2*3.14*r);
    }
}

class Rectangle implements Measurement{
    int l,b;
    public void input(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter length");
        l=s.nextInt();
        System.out.println("Enter breadth");
        b=s.nextInt();
        area();
        perimeter();
    }
    public void area(){
        System.out.println("Area of Rectangle :"+l*b);
    }
    public void perimeter(){
        System.out.println("Perimeter of Rectangle :"+2*(l+b));
    }
}

class AreaInterface{
    public static void main(String arg[]){
        circle c = new circle();
        Rectangle r= new Rectangle();
        Scanner s= new Scanner(System.in);
        int ch;
        do{

            System.out.println("1)Circle\n2)Rectangle\n3)Exit\nEnter your choice");
            ch=s.nextInt();

            if(ch==1){

                c.input();

            }else if(ch==2){
                
                r.input();
            }else if(ch==3){
                System.out.println("Exit");
                break;
            }else{
                System.out.println("Invalid input");

            }
        }while(ch!=0);
    }
}