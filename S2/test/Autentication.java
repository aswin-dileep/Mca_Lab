//Write a user defined exception class to authenticate the user name and password
import java.util.Scanner;

class loginexception extends Exception{
    public loginexception(String s){
        super(s);
    }
}

class Autentication{
    public static void main(String[] args){
        String username="Aswin";
        String password="Aswin123";
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter username");
        String u1=s.nextLine();

        System.out.println("Enter password");
        String u2=s.nextLine();
        
        try{
            if((u1.equals(username))&&(u2.equals(password)) ){
                System.out.println("Access Granted");
            }else{
                throw new loginexception("Invalid userid or password");
            }
        }catch(loginexception e){
            System.out.println(e);
        }
    }
}