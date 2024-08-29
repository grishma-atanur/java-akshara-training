package day10;
import java.util.Scanner;

public class Demo1 {
	//customer support call
	public static void main(String[] args) {
		
		//ask the user to enter 1,2,3
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 1 for English, 2 for Hindi, 3 for Kannada");
		int option=sc.nextInt();
		sc.close();
		//check if i/p is 1, print 'English'
		if(option==1)
		{
			System.out.println("You have selected English");
		}
		//check if i/p is 2, print 'Hindi'
		else if(option==2)
		{
			System.out.println("You have selected Hindi");
			
		}
		//check if i/p is 3, print 'Kannada'
		
		else if(option==3)
		{		System.out.println("You have selected Kannada");
		}
		//none of the --print 'Invalid Input'
		else {
			System.err.println("Invalid input");
		}
		
		
		}	
	}


