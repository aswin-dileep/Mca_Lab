//Perform string manipulations
import java.util.Scanner;
class stringmanip
{
	public static void main(String arg[])
	{
	          String str[]=new String[40];
		String s = "         Hello-Aswin";
		System.out.println("Original string :"+s);
		System.out.println("character at index 0 :"+s.charAt(0));
		System.out.println("substring from index 6 :"+s.substring(6));
		System.out.println("string to uppercase :"+s.toUpperCase());
		System.out.println("string to lowercase :"+s.toLowerCase());
		System.out.println("trim white spaces :"+s.trim());
		System.out.println("index of letter H :"+s.indexOf("H"));
		System.out.println("words after splitting :");
		str=s.trim().split("-");
		for(String i:str)
		{
			System.out.println(i);
		}
		System.out.println("Length :"+s.length());
		System.out.println("String are equal :"+str.equals("hello"));
		System.out.println("after concatining :"+s.concat("! Welcome"));
		System.out.println("replace Aswin with world"+s.replace("Aswin","World"));
	}
		
}
