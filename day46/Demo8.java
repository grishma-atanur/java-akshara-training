package day46;
//Exception handled in main() method instead of m1() or m2() method
public class Demo8 {
	public static void main(String[] args) {
		System.out.println("Main starts");
		try {
			m1();
		}
		catch(Exception e)
		{
			System.out.println("Cant divide");
			e.printStackTrace();
		}
		
		System.out.println("Main ends");
	}
		
		public static void m1()
		{
			System.out.println("m1 starts");
			m2();
			System.out.println("m1 ends");
		}
		
		public static void m2()
		{
			System.out.println("m2 starts");
			
			System.out.println(100/0);
			System.out.println("m2 ends");
			
		}
		
	}


