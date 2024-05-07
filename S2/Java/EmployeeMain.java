import java.util.Scanner;

class Employee{
    static int count=0;
    int eno;
    String ename;
    Double esalary;
    Scanner scan = new Scanner(System.in);
    Employee(){
        count++;
    }
    void getinfo(){
        System.out.println("Enter the Details of employee :"+count);
        System.out.println("Enter the Number :");
        eno = scan.nextInt();
        System.out.println("Enter the Name :");
        scan.nextLine();
        ename = scan.nextLine();
        System.out.println("Enter the Salary :");
        esalary = scan.nextDouble();
    }
}


class EmployeeMain {
    public static void main(String []arg){
        Employee e[] = new Employee[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of Employee :");
        int n = scan.nextInt();
        for( int i=1;i<=n;i++){
            e[i] = new Employee();
            e[i].getinfo();
        }

        System.out.println("\n Enter the employee's number to be searched : ");
        int num = scan.nextInt();

        for(int i=1;i<=n;i++){
            if(e[i].eno==num){
                System.out.println("employee's name is "+e[i].ename);
            }
        }
    }
}
