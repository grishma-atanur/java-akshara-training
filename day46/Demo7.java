package day46;
//Exception handled in m1() instead of m2() (where the exception occured)
public class Demo7 {
	public static void main(String[] args) {
		System.out.println("Main starts");
		m1();
		System.out.println("Main ends");
	}
		
		public static void m1()
		{
			System.out.println("m1 starts");
			try {
				m2();
			}
			catch(Exception e)
			{
				System.out.println("Cant divide");
				e.printStackTrace();
			}
			System.out.println("m1 ends");
		}
		
		public static void m2()
		{
			System.out.println("m2 starts");
			
			System.out.println(100/0);
			System.out.println("m2 ends");
			
		}
		
	}


