package day34;
//Encapsulation- ATM machine --very important

import java.util.Scanner;

class ATM {
	private int balance;
	private int PIN;
	private boolean askForPin = true;

	ATM(int openingBalance, int PIN) {
		this.balance = openingBalance;
		this.PIN = PIN;
	}

	private boolean authenticate() 
	{
		if (askForPin) 
		{
			System.out.println("please enter the pin");
			Scanner sc = new Scanner(System.in);
			int pin = sc.nextInt();

			if (this.PIN == pin) 
			{
				askForPin=false;//this is coz we dont want pin to be asked again and again
				System.out.println("Welcome");
				return true;
			}

			else 
			{
				System.out.println("Sorry,invalid PIN");
				return false;
			}
		} 
		else 
		{
			return true; //this means already entered valid Pin
		}
	}

	public void checkBalance() 
	{

		if (authenticate()) 
		{
			System.out.println("Balance is: " + balance);
		} else 
		{
			System.out.println("we cant tell you the balance");
		}
	}

	public void withdraw()
	{

		if (authenticate()) 
		{
			System.out.println("Please enter the amont to withdraw");
			Scanner sc = new Scanner(System.in);
			int amount = sc.nextInt();
			if (amount <= balance) {
				balance = balance - amount;
				System.out.println("zzzzz: please collect the amount: " + amount);
			} else {
				System.out.println("sorry, insufficient balance");
			}
		} 
		else 
		{
			System.out.println("We cant allow you to withdraw");
		}

	}
}

public class Demo3 {
	public static void main(String[] args) {
		ATM a1 = new ATM(1000, 123);
		boolean stop=false;

		do
		{System.out.println("1. Check Balance 2.Withdraw 3.Exit");
			Scanner sc=new Scanner(System.in);
			int option=sc.nextInt();
			switch(option)
			{
			case 1: a1.checkBalance();
				break;
				
			case 2: a1.withdraw();
				break;
				
				default: stop=true; 
					System.out.println("Thank you , see you tomorrow");
					break;
			}
		}
		while(!stop);
		
		
	}
}
