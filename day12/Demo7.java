package day12;
import java.util.Scanner;
public class Demo7 {
	// Print multiplication table of the given number
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("give the number you want the multiplication table of");
		int num=sc.nextInt();
		int i;
		for(i=1;i<=10;i++)
		{
			int res=num*i;
			System.out.println(num + "x" + i + "=" +res);
		}
		
		
		}
	}




