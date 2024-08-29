package day10;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
		
		//ask gender and age 
		System.out.println("Please select gender: 1-Female 2-Male");
		int gender=sc.nextInt();
		System.out.println("Please enter the age");
		int age=sc.nextInt();
		if(gender==1)
		{
			 if(age>=18)
			 {
			System.out.println("Lady, yes you can marry");
		}
			 else
			 {
				 System.out.println("Lady, you cant marry");
			 }
		}

		else if(gender==2)
		{
			 if(age>=21)
			 {
			System.out.println("Bro, yes you can marry");
		}
			 else
			 {
				 System.out.println("Kid, wait....");
			 }
		}

		else {
			System.out.println("Invalid Gender input");
		}
		
	}

}
