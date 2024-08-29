 package day23;
//a is global variable , b and c are local variable 
public class Demo2 {
	
	static int a=10;
	
	public static void main(String[] args) {
		
		int b=20;
		
		if(10>4)
		{
			int c=30;
			
			System.out.println(a);//a is accessible everywhere since it is global variable
			System.out.println(b);//b is accessible anywhere in the main block
			System.out.println(c);//c is aceesible only in if block
		}
		
		System.out.println(a);
		System.out.println(b);
//		System.out.println(c);//Error
	}
	
	public static void m1()
	{
		System.out.println(a);
//		System.out.println(b); //b is accessible only in main method
	}

}
