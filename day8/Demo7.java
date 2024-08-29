package day8;
import java.util.Scanner;


public class Demo7 {

	//accept L & B of rectangle and calculate the area
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);	
		
		//accept length
		System.out.println("please enter the length");
		int l=sc.nextInt();	
		
		//accept breadth
		System.out.println("Please enter the breadth");
		int b=sc.nextInt();
			
		
		//calculate area
		
		int area = l*b;
		
		//print the result
		System.out.println("The area of rectangle is  " +area);
		sc.close();

	}

}
