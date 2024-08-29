package day9;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		sc.close();
		String msg=n%2==0?n+" is even":n+" is odd";
		System.out.println(msg);

	}

}
