package day30;
//Example to show Method overloading can also be done in child class
//But method overriding can only be done in child class(Inheritance is mandatory)
class P
{
	void m1()
	{
		System.out.println("Hi");
	}
}

class C extends P
{
	void m1(int i) //Method overloading
	{
		System.out.println("Bye");
	}
}

public class Demo7 {
	public static void main(String[] args) {
		
		C c1=new C();
		c1.m1();
		c1.m1(100);
	}

}
