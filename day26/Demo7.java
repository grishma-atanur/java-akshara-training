package day26;
//calling static and non-static method from static method
class F
{
	public static void m1()
	{
		System.out.println("static method m1 of F");
	}
	
	public void m2()
	{
		System.out.println("non-static method m2 of F");
	}
	
	public  void MyMethod()
	{
		F.m1();//official way
		m1();
		
		this.m2();//official way
		m2();
		
	}
}

public class Demo7 {
	public static void main(String[] args) {
		
		F f1=new F();
		f1.MyMethod();
	
	}

}
