//Define a class product with data member pcode,pname and price create three objects of the class 
//and find the product having the lowest price

import java.util.Scanner;

class Product{
   int pcode;
   int price;
   String pname;
   int acceptValues(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the product name :");
        pname = s.nextLine();
        System.out.println("Enter the product id :");
        pcode = s.nextInt();
        System.out.println("Enter the product price :");
        price = s.nextInt();

        return price;
   }
   void display(){
    System.out.println("Name :"+pname);
    System.out.println("Pcode :"+pcode);
    System.out.println("price :"+price);

   }

}

class Q2product{
        public static void main(String[] arg){
            Product p1 = new Product();
            Product p2 = new Product();
            Product p3 = new Product();

            System.out.print("Product 1");
            int price1 =p1.acceptValues();

            System.out.print("Product 2");
            int price2=p2.acceptValues();

            System.out.print("Product 3");
            int price3 =p3.acceptValues();

           

        if(price1<price2 && price1<price3){
            p1.display();
        }else if(price2<price1 && price2<price3){
            p2.display();
        }else{
            p3.display();
        }
}
}