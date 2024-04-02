//Define a class product with data memebers pcode,pname and price. create three objects of the class and
//find the product having the lowest price 
import java.util.Scanner;

class Product{
    int pcode,pprice;
    String pname;
    void getProduct(String name,int pcode,int price){
        pcode=pcode;
        pname = name;
        pprice =price;
    }
}

class Products{
    public static void main(String[] args){
        Product [] pro;
        int code,price;
        String name;
        Scanner s = new Scanner(System.in);
        pro = new Product[3];

        for(int i=0;i<3;i++){
            pro[i] = new Product();
            System.out.println("\n Enter name of "+(i+1)+"th product :");
            s.nextLine();
            name = s.nextLine();
            System.out.println("\n Enter pcode of "+(i+1)+"th product :");
            code = s.nextInt();
            System.out.println("\n Enter price of "+(i+1)+"th product :");
            price = s.nextInt();
            pro[i].getProduct(name,code,price);
        }

        int min = pro[0].pprice;
        name = pro[0].pname;

        for (int i=1;i<3;i++){
            if (min>pro[i].pprice){
                min = pro[i].pprice;
                name = pro[i].pname;
            }
        }

        System.out.println("The product with min price is "+(name)+" price ="+min+" ");

    }
}