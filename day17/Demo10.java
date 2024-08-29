package day17;
/*
 * create a method called sum
 * accept 2 numbers as arguments
 * print the sum of 2 numbers
 * call the method with 10 & 20 as inputs
 */

public class Demo10 {
	
	public static void sum(int i, int j) {
		int sum=0;
		sum=i+j;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		Demo10.sum(10,20);
	}

}
