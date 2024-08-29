package day9;
import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
		
		System.out.println("start");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter value a");
		int a=sc.nextInt();
		System.out.println("Please enter value b");
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println(a+ " is greater than " +b);
		}
		else if(a<b)
		{
		System.out.println(b+ "is greater than a ");
		}
		else
		{
			System.out.println(" both " +a+ "and" +b+ " are equal");
			
		}
	}

}
