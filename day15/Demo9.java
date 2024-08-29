package day15;
//same as Demo 8 with slight variation
import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		//Ask user abouth the number of inputs , create an array with the
		//requested size, store them in array ,
		//print the sum of those array elements
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter size of an array(number of items to add)");
		int n =sc.nextInt();
		int [] a= new int[n];
		
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
		System.out.println("sum is "+sum);
		
		
		

	}

}
