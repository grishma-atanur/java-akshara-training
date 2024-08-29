package day39;

public class Demo2 {
	public static String getAddress(Object obj) {
		return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
	}
	public static void main(String[] args) {
		
		String s1 = "Grishma";
		String s2 = "Grishma";
		String s3 = "Geet";
		String s4="geet";
		s2="Surya";
		
		System.out.println(getAddress(s1));
		System.out.println(getAddress(s2));
		System.out.println(getAddress(s3));
		System.out.println(getAddress(s4));

		 
	}

}
