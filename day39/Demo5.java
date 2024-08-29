package day39;

public class Demo5 {
	public static void main(String[] args) {

		String s = "Aadhya";
		System.out.println(s.length()); //6

		System.out.println(s.isEmpty()); //not empty-false

		System.out.println(s.isBlank());  //not blank-false

		String s2 = "  "; //2 space

		System.out.println(s2.length()); //2

		System.out.println(s2.isEmpty()); //not empty-false

		System.out.println(s2.isBlank()); //true -no other characters except spaces
		//tricky part
		String s3="";
		System.out.println(s3.length()); //0

		System.out.println(s3.isEmpty()); //yes-true

		System.out.println(s3.isBlank()); //yes-true every empty string is also blank

	}

}
