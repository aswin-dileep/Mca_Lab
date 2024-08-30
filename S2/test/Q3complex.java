// Add two complex numbers using constructor

import java.util.Scanner;

class Complex{
    int r,i;
    Scanner s =new Scanner(System.in);
    Complex(int a,int b){
        r=a;
        i=b;
    }
    Complex(){
        System.out.println("Enter Real part :");
        r = s.nextInt();
        System.out.println("Enter imaginary part :");
        i = s.nextInt();
    }
    void show(){
        System.out.println(r+"+"+i+"i");
    }

    static void add(Complex a,Complex b){
        System.out.println(a.r+b.r+"+"+a.i+b.i);
    }
}

class Q3complex{
    public static void main(String[] args){
        Complex c1 = new Complex(8,5);
        Complex c2 = new Complex();

        c1.show();
        c2.show();

        Complex.add(c1,c2);
    }
}
