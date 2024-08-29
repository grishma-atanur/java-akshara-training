package day37;
//If a class implements interface, that class must override the methods of interface
//else you have to declare that class as abstract class
interface A

{
	void m1();
}

class B implements A  //Concrete class
{
	public void m1()
	{
		System.out.println("m1 of B");
	}
}

abstract class C implements A  //abstract class
{
	//we can have any type of variables
	int i=10;
	
	//we can have any type of methods
	void test()
	{
		
	}
	//we can have constructor, SIB , IIB
	public C()
	
	{
		
	}
	static
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	//We cant create object of a abstract class
	
}

public class Demo1 {
	public static void main(String[] args) {
		B b1=new B();
		b1.m1();
		
		C c1; //only refernce variable of abstract class can be created
		//c1=new C();// Cant create object of abstract class
		
	}

}
