package day38;
//Wrapper classes 
public class Demo2 {
	/*byte
	 * short
	 * int
	 * long
	 * float
	 * double
	 * char
	 * boolean
	 */
	
	public static void main(String[] args)
	{
		 int i=10;
		 String s=new String ("Grishma");
		 String s2="Grishma"; //auto-boxing
		 //Integer obj=new Integer(10) -->not valid anymore
		 //converting primitive data type into non-primitive data type-->Boxing
		 Integer obj=Integer.valueOf(10);
		 Integer obj2=10; //auto boxing
		 
		 System.out.println(i);
		 System.out.println(s);
		 System.out.println(obj);
		 
		 Byte a; //wrapper classes
		 Short b;
		 Long c;
		 Float d;
		 Double e;
		 Character f;
		 Boolean g;
		 
		 
	}

}
