package day14;

import java.util.Scanner;

//check whether number is prime number 

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// String msg=" It is a Prime number";
		System.out.println("Enter the number");
		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println("Invalid Input");
		} else if (n == 1) {
			System.out.println("1 is not a Prime number");
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					System.out.println("It is not a Prime number");
					break;
				}

			}

		}

	}
}
