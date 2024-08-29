package day30;
//Example to show rules of Method overriding
class Parent
{
	public void m1()
	{
		System.out.println("Hi");
	}
	
	protected void m2(int i)
	{
		System.out.println("Hi");
	}
	
	int m3()
	{
		return 100;
	}
	
} 

class Child extends Parent
{
	@Override
	public void m1()
	{
		System.out.println("Bye");
	}
	
	@Override
	protected void m2(int i)
	{
		System.out.println("Bye");
	}
	
	@Override
	protected int m3()
	{
		return 200;
	}
	
	//@override
//	public int m3()
//	{
//		return 300;
//	}
	
}

public class Demo6 {
	public static void main(String[] args) {
		
	}

}
