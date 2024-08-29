package day10;

import java.util.Scanner;

public class Demo4 {
	//check whether a person can vote
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Please enter the age");
		int age=sc.nextInt();
		sc.close();
		
		if(age>=18)
		{
			System.out.println("you are eligible to vote");
		}
		else
		{
			System.out.println("you are not elible to vote");
		}
		
		
	}

}
