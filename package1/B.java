package package1;

public class B extends A{

	public static void main(String[] args) {
		System.out.println(A.i);
		System.out.println(A.j);
		System.out.println(A.k);//can access package private
//		System.out.println(A.l); //can't access private

	}

}
