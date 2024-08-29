package day37;

interface P4
{
	default void m1()  //public non-static concrete method
	
	{
		System.out.println("public non-static concrete method of P4 interface");
		m1a();
	}
	
	private void m1a()
	{
	System.out.println("Private non static concrete method of P4 interface");
	}
	 static void m2()
	{
		
		System.out.println("public static concrete method");
	}
	
	private static void m2a()
	{
		
		System.out.println("private static concrete method");
	}
	
}	

class C4 implements P4
{
	
}

public class Demo7 {
public static void main(String[] args) {
	P4 p4=new C4();
	p4.m1(); //non static method-using referencr variable
	
	P4.m2(); //static method -using interface name
}
}
