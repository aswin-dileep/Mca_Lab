import java.util.Scanner;
class ComplexNum{
	int r,i;
	Scanner s = new Scanner(System.in);
	ComplexNum(int a, int b){
		r=a;
		i=b;
	}
	ComplexNum(){
		System.out.println("Enter Real part :");
		r = s.nextInt();
		System.out.println("\nEnter imaginary part :");
		i =s.nextInt();
	}
	void show(){
		System.out.println(r+"+"+i+"i");
	}
	
	static void add(ComplexNum a,ComplexNum b){
	
		System.out.println((a.r+b.r)+"+"+(a.i+b.i)+"i");
	}
	
}

class Complex{
	public static void main(String[] args){
		ComplexNum c1 = new ComplexNum(8,5);
		ComplexNum c2 = new ComplexNum();
		c1.show();
		c2.show();		
		ComplexNum.add(c1,c2);
	
	}

}
