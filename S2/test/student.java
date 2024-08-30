//program to create static and non static methods

import java.util.Scanner;

class student{
    Scanner s = new Scanner(System.in);
    String name;
    int rollNo,mark;

    public void EnterDetails(){
        System.out.println("\n Enter the details ");

        System.out.println("\n Enter the Roll No :");
        rollNo = s.nextInt();
        s.nextLine();
        System.out.println("\n Enter the Name :");
        name = s.nextLine();

        System.out.println("\n Enter the mark :");
        mark = s.nextInt();
    }

    public void show(){
        System.out.println("\n ROll NO :"+rollNo);
        System.out.println("\n Name :"+name);
        System.out.println("\n Mark :"+mark);
    }

    public static void staticshow(){
        System.out.println(
            "\n this is the static method"
        );
    }

    public static void main(String[] args){
        student s = new student();
        s.EnterDetails();
        s.show();
        s.staticshow();
    }

}