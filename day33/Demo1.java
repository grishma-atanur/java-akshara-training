package day33;

//Method chaining example 

class A
{
	public String m1()
	{
		String s="abc";
		return s;
	}
}

public class Demo1 {
	public static void main(String[] args) {
		
	//	String s=new String("abc"); //Creating String object
	//	int l=s.length(); //calling non-static  length method present on String classs
	//	System.out.println(l);
		
	//	A a1=new A();
	//	String s=a1.m1();//m1 is non-static method present in A class
	//	int l=s.length(); //length() is non-static method present in String classs
	//	System.out.println(l);
	//	//a1.m1().m2().m3().m4().m5(); example of method chaining-chain breaks as soon as we encounter primitive reference variable
		
		A a1=new A();
		int l=a1.m1().length(); //length method is present in the string object returned by m1 Method
		System.out.println(l);
		
	}

}
