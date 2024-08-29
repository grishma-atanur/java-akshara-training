 package day40;
//Interview Question- Print the given String vertically
public class Demo7 {
	public static void main(String[] args) {
		String s="TCS";
		char[] a=s.toCharArray(); //convert String in to Array
		for(char v:a)
		{
			System.out.println(v);
		}
		
		System.out.println("-------");
		for(int i=0;i<s.length();i++) // possible with charAt() method also
		{
			System.out.println(s.charAt(i));
		}
	}
	

}
