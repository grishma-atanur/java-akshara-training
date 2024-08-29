package day8;

import java.util.Scanner;

public class Demo8 {
	//accept the input from user to calculate the area of the circle

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	//accept radius
		System.out.println("please enter the radius");
		int r=sc.nextInt();		
		//Calculate area
		//double area=3.14*r*r;
		//instead of 3.14 we can also use Math.PI to get accurate result
		double area=Math.PI*r*r;
		//print area
		System.out.println("Area of circle is " +area );
		sc.close();
		
		}

}
