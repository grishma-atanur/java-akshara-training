package day18;

public class Demo4 {
	//Method overloading -Different modifiers
	public static void m1()

	{
		System.out.println("Hi");
	}
	
	 private static int m1(int i)
	 {
		 System.out.println("Bye");
		 return 0;
	 }
	 
	 public static void main(String[] args) {
		m1(10);
		m1();
	}
}
