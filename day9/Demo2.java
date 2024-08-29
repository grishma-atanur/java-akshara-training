 package day9;
import java.util.Scanner;


public class Demo2 {
	//Check if given number is +ve or not

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//accept a number from user
		System.out.println("Enter a number");
		int i=sc.nextInt();
		sc.close();
		
		//check if number is greater than 0 then print number is +ve
		if(i>0)
		{
			System.out.println("Number is positive");
		}
		else
		{
			System.out.println("Number is not positive ");
		}
		
		//else print number is not +ve
	}

}
