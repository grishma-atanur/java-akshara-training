package package2;
import package1.A;

public class D extends A{

	public static void main(String[] args) {
		System.out.println(A.i);
		System.out.println(A.j);
//		System.out.println(A.k); // package private not accessible
//		System.out.println(A.l); //can't access private

	}

}
