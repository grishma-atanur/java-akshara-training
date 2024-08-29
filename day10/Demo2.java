package day10;

import java.util.Scanner;

//Check if the person is eligible for marriage
 
public class Demo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//ask gender and age 
		System.out.println("Please select gender: 1-Female 2-Male");
		int gender=sc.nextInt();
		System.out.println("Please enter the age");
		int age=sc.nextInt();
		//check if female 18--->yes
		
		if(gender==1 && age>=18)
		{
			System.out.println("Lady, you are eligible for marriage");
		}
		
		//check if male 21---->yes
		else if(gender==2 && age>=21)
		{
			System.out.println("bro, you are eligible for marriage");
			
		}
		else
		{
			System.out.println("you are not eligible for marriage");
		}
		
	}

}

//else you can use nested if see Demo3


