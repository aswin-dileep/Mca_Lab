//program to create static and non static methods 
import java.util.Scanner;

class Student{
    String name;
    int roll_no,mark;
    Scanner s = new Scanner(System.in);
    public void enterStudent(){
        System.out.println("\n Enter Student Details");
        System.out.println("\n Enter Name :");
        name = s.nextLine();
        System.out.println("\n Enter Roll No :");
        roll_no = s.nextInt();
        System.out.println("\n Enter mark :");
        mark = s.nextInt();
    }
    public void show(){
        System.out.println("\n Name :"+name);
        System.out.println("\n Roll No :"+roll_no);
        System.out.println("\n Mark :"+mark);

    }
    public static void showStatic(){
        System.out.println("\n Static method ....");

    }

    public static void main(String[] args){
        Student stu = new Student();
        try{
            stu.enterStudent();
            stu.show();
            showStatic();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}