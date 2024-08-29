package day32;
//Example for Runtime polymorphism- Method overriding

class P {
	void m1() {
		System.out.println("P Hi");
	}
}

class Q extends P {
	void m1() {
		System.out.println("Q Hi");
	}
}

class R extends P {
	void m1() {
		System.out.println("R Hi");
	}
}

public class Demo3 {
	public static void test(P p1) {
		p1.m1();
	}

	public static void main(String[] args) {

		P p1 = new P();
		Demo3.test(p1);

		P p2 = new R();
		Demo3.test(p2);

		P p3 = new Q();
		Demo3.test(p3);
	}
}
