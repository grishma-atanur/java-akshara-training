package day36;
//Abstract, concrete class and interface

interface A
{
	void m1();
	void m2();
	
}

abstract class B implements A
{
	public void  m1()
	{
		
	}
}

class C extends B //100% concrete
{
	public void m2()
	{
		
	}
}



public class Demo7 {
	public static void main(String[] args) {
		C c1=new C();
	}

}
