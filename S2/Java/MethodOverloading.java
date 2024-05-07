class area{

    void findarea(int s){
        System.out.println("Area of square :"+s*s);
    }

    void findarea(int l,int b){
        System.out.println("Area of rectangle :"+l*b);
    }
}


public class MethodOverloading {
    public static void main(String []arg){
        area ob = new area();
        ob.findarea(2);
        ob.findarea(4,5);
    }
}
