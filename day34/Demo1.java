 package day34;
 //Encapsulation- Allow user to get balance of the Bank account but don't allow user to 
 //modify the balance
 
 class Account 
 {
	 //Declaration
	 private int balance;
	 
	 //Initialization
     Account(int balance)
	 {
		 this.balance=balance;
	 }
	
     //Utilization
	public int getBalance()
	 {
		 return balance;
	 }
 }

public class Demo1 {
	public static void main(String[] args) {
			Account a=new Account(10000);
			System.out.println(a.getBalance());
		
	}

}
 