package day16;

import java.util.Scanner;

public class Demo4 {
	
	public static void main(String[] args) {
		/*Demonstration to understand we cannot 
		 * write into an Array using "foreach"
		 *loop
		 */
		
		int [] a= new int[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Please enter the number");
			int n=sc.nextInt(); //Writing into an Array
		}
		
		for(int v:a)
		{
			System.out.println("Please enter the number");
			a[v]=sc.nextInt();
			}
		sc.close();
	}

}
