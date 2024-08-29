package day27;
//Execution of non-static block  
class C
{
	static int i=10;
	int j=20;
	{
		System.out.println("Non-static block1");
	}
	C()
	{
		System.out.println("UDC");//user defined constructor 
	}
	{
		System.out.println("Non-static block2");
	}
	{
		System.out.println("Non-static block3");
	}

	
}

public class Demo5 {
	public static void main(String[] args) {
		
		System.out.println("Main starts");
		System.out.println(C.i);
		
		C c1=new C();
		System.out.println(c1.j);
	}

}
