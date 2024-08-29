package day32;
//Up-casting-1)Method present only in parent
//2)Method present in parent and child both
//3)Method present only in child
class A {
	void m1() {
		System.out.println("M1 present only in Parent");
	}

	void m2() {
		System.out.println("M2 present in Parent");
	}
}

class B extends A {
	void m3() {
		System.out.println("M3 method present only in child"); // Hidden method
	}
}

public class Demo1 {
	public static void main(String[] args) {

		B b1 = new B();
		b1.m1(); // Parent
		b1.m2(); // child
		b1.m3(); // child

		A a1 = new A();
		a1.m1();// method present in parent
		a1.m2();// method present in child-overridden method is accessed
//		a1.m3(); //hidden method can't be accessed from parent class reference variable

	}

}
