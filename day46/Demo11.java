package day46;

public class Demo11 {
	public static void main(String[] args) {
		try
		{
		m1();
		
		}
		
		catch(Exception e)
		
		{
			
		}
		System.out.println("Main ends");
	}
	public static void m1() throws InterruptedException
	{
		System.out.println("m1 starts");
		Thread.sleep(2000);
		System.out.println("m1 Hi");
		System.out.println("m1 ends");
	}

}
 