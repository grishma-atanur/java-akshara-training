package day38;

public class Demo3 {
	public static void main(String[] args) {
		
		Integer a=Integer.valueOf(10); //Boxing
		Integer b=10; //Auto-boxing
		
		int c=a.intValue(); //converting non-primitive to primitive - Unboxing
		int d=a;//Auto-unboxing
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		if(a.equals(b))
		{
			System.out.println("compare object");
		}
		
		if(c==d)
			System.out.println("compare values");
	}

}
