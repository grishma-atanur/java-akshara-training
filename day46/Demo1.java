package day46;
//Null Pointer Exception
public class Demo1 {
	public static String s; // s is not initialsed
	public static void main(String[] args) {
		System.out.println("Main starts");
		int l=s.length(); //no object of string s so l points to null
		//so we get null pointer exception
		System.out.println(l);
		System.out.println("Main ends");
		 
		
	}

}
