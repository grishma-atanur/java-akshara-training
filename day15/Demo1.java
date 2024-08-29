package day15;

import java.util.Scanner;

public class Demo1 {
	// Add two numbers given by user until user says stop
	public static void main(String[] args) {
		int stop;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("Enter first number");
			int n1 = sc.nextInt();

			System.out.println("Enter second number");
			int n2 = sc.nextInt();

			int sum = n1 + n2;

			System.out.println(sum);

			System.out.println("Do you want to stop?(1-yes  0-No)");
			stop = sc.nextInt();

		} while (stop == 0); // if conditon is true it will continue
		// the loop else it will exit
		sc.close();

	}
}
