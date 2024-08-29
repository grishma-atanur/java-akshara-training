package day31;

//Can we access final method in child class?
//yes, but we cannot override it
class A {
	private void m1() // cannot be inherited as it is private, so as we cannot inherit it
	// we can't override it
	{
		System.out.println("m1");
	}

	final void m2() // this can be inherited but we can't override it as it is final
	{
		System.out.println("m2");
	}
}

class B extends A {

}

public class Demo2 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.m2();
	}

}
