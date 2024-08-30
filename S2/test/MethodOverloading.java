//Area of different shapes using overloading

class area{
    int r1,r2;
    void areaa(float r){
        System.out.println("Area of Circle :"+3.14*r*r);
    }
    void areaa(int s){
        System.out.println("Area of Square :"+s*s);
    }
    void areaa(int l,int b){
        System.out.println("area of rectangle :"+(l*b));
    }
}

class methodOverloading{
    public static void main(String arg[]){
        area ob = new area();
        ob.areaa(2.5);
        ob.areaa(2);
        ob.areaa(3,4);
    }
}