package day24;
//All types of constructor
class A
{
	
}

class B
{
	B()
	{
	System.out.println("Hi");
	}
}

class C
{
	C(int i)
	{
		System.out.println(i );
	}
}

class D
{
	void D()//This is not a constructor this is a Method (coz it has return type)
	{
		System.out.println(100);
		
	}
}

public class Demo2 {
 public static void main(String[] args) {
	
	 A a1=new A();//calls Default constructor as this class doesnt contain any constructor
	 
	 B b1=new B();//user defined constructor with no args
	 
	 C c1=new C(10); //user defined parameterized constructor
	 
	 D d1=new D();// this call for Default constructor since this class doesnt contain any constructor
	 
	 d1.D();// Prints 100
	 
	 
}
}
