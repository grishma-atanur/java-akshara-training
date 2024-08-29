package day10;

import java.util.Scanner;

public class Demo5 {
	//accept number and print day name : 1-Sunday.......7-Saturday
	/*you can convert if statements to switch statement 
	 * automatically using "CTRL 1"
	 * just place cursor on if statement in Demo 3 of day 10 and in options select "convert to Switch"
	 * then copy paste the code
	 */
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		 
		if(num==1)
		{
			System.out.println("day is Monday");
		}
		else if(num==2)
		{
			System.out.println("day is Tuesday");
		}
		else if(num==3)
		{
			System.out.println("day is wednesday");
		}
		else if(num==4)
		{
			System.out.println("day is Thursday");
		}
		else if(num==5)
		{
			System.out.println("day is friday");
		}
		else if(num==6)
		{
			System.out.println("day is Saturday");
		}
		else if(num==7)
		{
			System.out.println("day is Sunday");
		}
		
		else
		{
			System.out.println("invalid input");
		}
	}

}
