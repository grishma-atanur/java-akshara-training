package day39;
//String is immutable, original string is not changed, you need to store it separately for changed value
//toLowerCase, toUppercase
public class Demo6 {
	public static void main(String[] args) {
		
		String s="Grishma";
		String s2=s.toLowerCase();
		System.out.println(s); //Grishma
		System.out.println(s2);//grishma
		
		String s3=s2.toUpperCase();
		System.out.println(s3);
		
		
		
		
	}

}
