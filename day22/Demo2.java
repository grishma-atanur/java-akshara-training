package day22;

class B{
	//primitive datatype-->byte short int long float double
	//non-primitive data type-->class(built-in & user defined) array Interface Enum
	
	byte a=1;
	short b=300;
	int c=1000;
	long d=20000;
	float e=2.2f;
	double f=2.34;
	boolean g=true;
	char h='a';
	
	String i="Grishma";
	A obj2=new A();//of Demo 1
	int [] k= {10,20,30};
	
	
}

public class Demo2 {

	public static void main(String[] args) {
		//Print all variables of B class here
		
		B obj;
		obj=new B();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.e);
		System.out.println(obj.f);
		System.out.println(obj.g);
		System.out.println(obj.h);
		
		System.out.println(obj.i);
		System.out.println(obj.obj2.i);//Accessing i of class A of Demo1
		System.out.println(obj.k);//prints 
		System.out.println(obj.k[0]); 
		
	}

}
