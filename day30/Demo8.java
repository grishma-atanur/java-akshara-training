package day30;
 //Example of Method overloading

public class Demo8 {
	
	private void m1()
	{
		System.out.println("Hi");
	}
	
	private static void m1(int i)
	{
		System.out.println("Bye");
	}
	
	public static void main(String[] args) {
		Demo8 d=new Demo8();
		d.m1();
		d.m1(100); 

	}

}
