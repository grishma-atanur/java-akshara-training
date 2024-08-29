package day40;
//Interview Question-Reverse the given String
public class Demo8 {
	public static void main(String[] args) {
		 String s="IBM";
		 char[] a=s.toCharArray();
		 
		 for(int i=s.length()-1;i>=0;i--)
		 {
			 System.out.println(a[i]);
		 }
	}

}
