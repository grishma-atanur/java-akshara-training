package day23;
//Demonstration os static variable : No matter how many objects you create
//static variables are stored just as single copy
class Account {
	static final String bank = "SBI";
	static String city = "pune";
	final int PAN = 4567;
	int pin = 123;

}

public class Demo6 {
	public static void main(String[] args) {
		System.out.println(Account.bank);// static way
//Error		System.out.println(Account.pin); we can accesss non-static members of the class 
		// with class name

		Account a1 = new Account();
		System.out.println(a1.bank);// static variables can also be
		// accessed with object(reference variable)
		System.out.println(a1.pin);

		Account a2 = new Account();
		System.out.println(a2.bank);//The static field Account.bank should be accessed in a static way
		// No matter how many objects you have, 
		//static variable will have single copy stored
		System.out.println(a2.pin);//
	}

}
