//program to sort strings

import java.util.Scanner;

class Strsort{
    public static void main(String[] args){
        int count,i,j;
        String s[]=new String[20];
        Scanner ob1=new Scanner(System.in);
        Scanner ob2=new Scanner(System.in);
        System.out.println("Enter the count of string");
        count = ob1.nextInt();
        
        for(i=0;i<count;i++){
            s[i]=ob2.nextLine();
        }

        String temp;
        for(i=0;i<count;i++){
            for(j=i+1;j<count;j++){
                if(s[i].compareTo(s[j])>0){
                    temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
            
        }

        System.out.println("Sorted string is :");
        for(i=0;i<count;i++){
            System.out.print(s[i]);
        }

    }
}