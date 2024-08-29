package day14;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		
	
	
	String msg="It is a Prime Number";
	System.out.println("Enter a Number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	if(n<=0)
	{
		System.out.println("Invalid Input");
	}
	else if(n == 1)
	{
		msg="It is NOT a Prime Number";
		
	}
	else
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0) {
				msg="It is NOT a Prime Number";
				break;
			}
		}
		
	}
	System.out.println(msg);
	} 
}
