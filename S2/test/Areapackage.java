import java.util.Scanner;
import Graphics.*;

class Areapackage{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int ch;
        do{
            System.out.println("\nEnter your Choice \n Find area \n 1)Rectangle \n 2)Triangle \n3)square \n 4)circle \n 5Exit \n");
            ch =s.nextInt();
            if(ch==1){
                Rectangle r = new Rectangle();
                System.out.println("Enter Length");
                int l=s.nextInt();
                System.out.println("Enter Breadth");
                int b=s.nextInt();
                //r.area(l,b);
            }else if(ch==2){
                Triangle t = new Triangle();
                System.out.println("Enter Base");
                int b=s.nextInt();
                System.out.println("Enter Height");
                int h =s.nextInt();
                t.area(b,h);
            }else if(ch==3){
                square sq = new square();
                System.out.println("Enter side");
                int a =s.nextInt();
                sq.area(a);
            }else if(ch==4){
                circle c = new circle();
                System.out.println("Enter Radius :");
                int r=s.nextInt();
                c.area();
            }else if(ch==5){
                System.out.println("Exited");
                break;
            }else{
                System.out.println("Invalid choice!");
            }
        }while(true);
    }
}