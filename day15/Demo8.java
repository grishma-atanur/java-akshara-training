package day15;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		//take 3 numbers from user and store it in array,
		//print the sum-Interview question
		
		int [] a= new int[3];// 3 is size of the array
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
		System.out.println("Please Enter the number");
		a[i]=sc.nextInt(); //Writing into Array
		}
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			sum=sum+a[i]; //Reading an Array
		}
		System.out.println(sum);
		
		
		

	}

}
