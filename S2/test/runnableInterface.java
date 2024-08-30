class Fibnacci implements Runnable{
    int limit;
    Fibnacci(int limit){
        this.limit=limit;
    }
    public void run(){
        int a=0,b=1;
        System.out.println("Fibonacci Series:");
        while(a<=limit){
            System.out.print(a+" f");
            int next=a+b;
            a=b;
            b=next;
        }
        System.out.println();
    }
}
class even implements Runnable{
    int n1,n2;
    even(int x,int y){
        n1=x;
        n2=y;
    }
    public void run(){
        System.out.println("Even numbers");
        for(int i=n1;i<=n2;i++){
            if(i%2==0){
                System.out.print(i+" e");
            }
        }
        System.out.println();
    }
    
}

class runnableInterface{
 
    public static void main(String[] args){
        Runnable Fib = new Fibnacci(1000);
        Runnable e = new even(1,50);

        Thread t1 = new Thread(Fib);
        Thread t2 = new Thread(e);

        t1.start();
        t2.start();
    }
    
}