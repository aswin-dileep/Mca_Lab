package Graphics;

interface squareInterface{
    void area(int a);
}
public class square implements squareInterface{
    public void area(int a){
        System.out.println("\n Area of Square :"+a*a);
    }
}