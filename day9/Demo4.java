package day9;
import java.util.Scanner;

public class Demo4 {
//Accept the number from user and check if it is even or odd number
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		sc.close();
		/*if number divided by 2 reminder is 0 then it is even else if number 
		 * is divided by and reminder is not zero then it is odd
		 */
		if(n%2==0)
		{
			System.out.println(n+ " is even");
		}
		else
		{
			System.out.println(n+ " is odd");
		}
		
		//write same program using ternary operator
		
		String msg=n%2==0?n+"is even":n+"is odd";
		System.out.println(msg);
			}

}
