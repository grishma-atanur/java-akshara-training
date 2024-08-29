package day37;
/* we declare a class as abstract when
 * 1) It has atleast 1 abstract method - mandatory
 * 2)It has only static methods - best practice (Selenium we have By class)
 */

abstract  class T {
	public static void m1() {
		System.out.println("m1");
	}

	public static void m2() {
		System.out.println("m2");
	}

	public static void m3() {
		System.out.println("m3");
	}
}

public class Demo4 {
	public static void main(String[] args) {

		T.m1();
		T.m2();
		T.m3();
	}
}
