 package day22;

import java.util.Scanner;

public class Demo3 {
	//primitive
	
	int a=10;
	
	//non-primitive built in class-1
	 String b="Grishma";
	 Scanner sc=new Scanner(System.in);//scanner is also class
	 
	 
	
	//non-primitive Array-1
	 int[] c= {10,20,30};
	 String[] s= {"abc","xyz"};
	
	//non-primitive user defined-1
	Demo2 d=new Demo2();
	 
	 
	
	public static void main(String[] args) {
		//print here
		Demo3 obj=new Demo3();
		
		System.out.println(obj.b);
		System.out.println(obj.b);
		System.out.println(obj.s[0]);
		System.out.println(obj.sc);
		System.out.println(obj.s);
	}

}
