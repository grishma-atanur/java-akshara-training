package day26;
//calling static and non-static method from static method
class E
{
	public static void m1()
	{
		System.out.println("static method m1 of E");
	}
	
	public void m2()
	{
		System.out.println("non-static method m2 of E");
	}
	
	public static void MyMethod()
	{
		E.m1();//official way
		m1();//this also works as both are static and both are in same class
		
		
	//	this.m2();//this doesn't work under static method, so we need to create object for accessing m2();
		E e1=new E();
		e1.m2(); 
		
	//	e1.m1(); works but not recommended
		
		
	}
}

public class Demo6 {
	public static void main(String[] args) {
		
	E.MyMethod();
	}

}
