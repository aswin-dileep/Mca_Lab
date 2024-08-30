//Create class Employee having attributes eno,cname,esalary.read 'N' employee information and search for an employee given 
//eno,using the concept of array of objects

import java.util.Scanner;

class Employee{
    int eno,salary;
    String name;
    Scanner scan =new Scanner(System.in);
    void getInfo(){
       
        System.out.println("Enter the employee No :");
        eno =scan.nextInt();
        System.out.println("Enter the Employee Name :");
        scan.nextLine();
        name = scan.nextLine();
        System.out.println("Enter the Salary :");
        salary = scan.nextInt();

    }

}

class EmployeeMain{
    public static void main(String[] args){
        Employee e[] = new Employee[10];
        Scanner s = new Scanner(System.in);
        int n,c;
        System.out.println("Enter the number of employees");
        n = s.nextInt();

        for(int i=0;i<n;i++){
            e[i]=new Employee();
            e[i].getInfo();
        }
         System.out.println("Enter the employee NUmber to find ");
         c = s.nextInt();
        for(int i=1;i<=n;i++){
            if (e[i].eno==c){
                System.out.println("The name of Employee is "+e[c].name); 
            }
        }
                

    }
}

