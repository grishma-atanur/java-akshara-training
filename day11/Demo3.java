package day11;

import java.util.Scanner;

public class Demo3 {
	//day10-Demo5(used if else)--> convert same program using Switch statement
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		int num =sc.nextInt();
		
		switch(num)
		{
		default: System.out.println("Invalid Input");
		break;
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7 : System.out.println("Sunday");
		break;
		
		}// close Switch 
	}//close main
}//close class
