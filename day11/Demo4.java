package day11;

import java.util.Scanner;

public class Demo4 {
	/* i/p 1,2,3-->Q1  4,5,6-->Q2  7,8,9-->Q3  10,11,12-->Q4
*/
	
	//using Fall Through Concept
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month");
		int month=sc.nextInt();
		switch(month)
		{
		case 1: 
		case 2: 
		case 3:System.out.println("Q1"); 
		break;
			
			
		case 4: 
		case 5: 
		case 6: System.out.println("Q2");
		break;
			
			
		case 7: 
		case 8: 
		case 9: System.out.println("Q3");
		break;
			
			
		case 10: 
		case 11: 
		case 12: System.out.println("Q4");
		break;
		
			
		}
	
	}
}
