package day18;

public class Demo3 {
	//Method overloadig : order of arguments should be different
	
	public static void m1(int i, String s)
	{
		System.out.println("Hi");
	}
	
	public static void m1(String s,int i )
	{
		System.out.println("bye");
	}
	
		public static void main(String[] args)
		{
			m1(10,"abcd");
			m1("abcd",10);
		}

}
