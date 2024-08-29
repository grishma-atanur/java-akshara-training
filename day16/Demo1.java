package day16;

import java.util.Scanner;

public class Demo1 {
	//Array-Searching
	public static void main(String[] args) {
		
		int [] a= {10,20,30,40};
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please enter a number to serach");
		 int n=sc.nextInt();
		 
		 String msg="Not Found";
		 
		 for(int i=0;i<a.length;i++)
		 {
			 
			 if(a[i]==n)
			 {
				 msg="Found";
				 break;
			 }
		 }
		 System.out.println(msg);
				
	}

}
