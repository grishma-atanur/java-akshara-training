package day24;

public class Demo1 {
	static final int a = 10;
	final int b = 20;
	static int c;
	int d;

	static final String e = "elephant";
	final String f = "fish";
	static String g;
	String h;

	public static void main(String[] args) {

		final int i=10;
		int j=10;

		final String k="Kangroo";
		String l="lion";
		
		//accessing these variables- we should check if they are static or non-static
		//static variables are accessed using class name
		//non static variables are accessed using object
		
		System.out.println(Demo1.a);//static way -official way
		Demo1 obj1=new Demo1();
		System.out.println(obj1.a);//Not recommended
		System.out.println(obj1.b);
		System.out.println(Demo1.c);
		System.out.println(obj1.d);
		
		System.out.println(Demo1.e);
		System.out.println(obj1.f);
		System.out.println(Demo1.g);
		System.out.println(obj1.h);
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		

	}

}
