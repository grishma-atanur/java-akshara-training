package day24;
//Constructor will have direct access to all types of Global variables directly
//Constructor cannot access local variables- coz local variables are local to thier 
//respective methods
class F{
		static final int a=10;
		final int b=10;
		
		static final int c=10;
		final int d=10;
		
		static final String e="abcd";
		final String f="abc";
		
		static String g="abc";
		String h="Abc";
		
		F()// Constructor
		{
			final int i=10;
			int j=10;
			
			final String k="abcd";
			String l="abc";
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
			System.out.println(g);
			System.out.println(h);
			
			System.out.println(i);
			System.out.println(j);
			System.out.println(k);
			System.out.println(l);
			
			
		}
		
	 
}

public class Demo4 {

	public static void main(String[] args) {
		F f1=new F();

	}

}
