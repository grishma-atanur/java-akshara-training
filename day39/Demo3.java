package day39;
//equals() method, compareTo() method, == operator
public class Demo3 {
	public static void main(String[] args) {
		String s1 = "Grishma";
		String s2 = "Grishma";

		String s3 = new String("Grishma");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println(s1 == s2);// == to compare address of the object-true
		System.out.println(s1 == s3);// false

		System.out.println(s1.equals(s2)); // equals() method comapres string values-true
		System.out.println(s1.equals(s3));// true

		System.out.println(s1.compareTo(s3)); // to compare which is greater or lesser

	}

}
