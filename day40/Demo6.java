 package day40;
//compareTo-compares Ascii value
public class Demo6 {
	public static void main(String[] args) {
		
		int a='a';
		System.out.println(a); //97-ASCII value
		
		System.out.println("a".compareTo("a")); //0
		System.out.println("a".compareTo("b")); //-1
		
		System.out.println("d".compareTo("p")); //-12
		System.out.println("b".compareTo("a")); //1
		
		System.out.println("p".compareTo("d")); //12
	}

}
