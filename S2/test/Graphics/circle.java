package Graphics;
interface circleInterface{
    void area(int r);
}
public class circle implements circleInterface{
    public void area(int r){
        System.out.println("Area of circle :"+3.14*r*r);
    }
}