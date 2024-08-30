//Read two matrices from the console and perform matrix addition 
import java.util.Scanner;

class matrix{
    int r,c;
    int [][] mat=new int[20][20];
    Scanner s = new Scanner(System.in);
    void read()
	{
		int i,j;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the rows and columns:");
		r=scan.nextInt();
		c=scan.nextInt();
		System.out.println("enter the elements");
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=c;j++)
			{
				mat[i][j]=scan.nextInt();
			}
		}
		
	}

    void display()
	{
		int i,j;
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=c;j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}

class matrixtest{

    public static matrix add(matrix a,matrix b){
        
        matrix m= new matrix();
        m.r=a.r;
        m.c=a.c;
        for(int i=1;i<=a.r;i++){
            
            for(int j=1;j<=a.c;j++){
                m.mat[i][j]=a.mat[i][j]+b.mat[i][j];
            }
        
        }
        return m;
    } 

    public static void main(String[] args){
        matrix m1 = new matrix();
        matrix m2 = new matrix();
        matrix res = new matrix();

        m1.read();
        m2.read();
        m1.display();
        m2.display();

        res = add(m1,m2);

        res.display();
    }
}