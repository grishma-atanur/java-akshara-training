package day41;

class A {
	private String v = "Grishma";
	A(String v)
	{
		this.v=v;
	}

	public String getString() {
		return v;
	}
}

class B {
	B(Integer v)
	{
		this.i=i;
	}
	private Integer i = 100;

	public Integer getInteger() {
		return i;
	}
}

class C {
	
	private Cat c;
	
	C(Cat c)
	{
		this.c=c;
	}

	public Cat getCat() {
		return c;
	}
}

public class Demo4 {
	public static void main(String[] args) {
		A a1 = new A("Grishma");
		String v1 = a1.getString();
		System.out.println(v1);

		B b1 = new B(100);
		Integer v2 = b1.getInteger();
		System.out.println(v2);

		C c1 = new C(new Cat());
		Cat v3 = c1.getCat();
		System.out.println(v3);

	}

}
