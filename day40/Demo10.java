package day40;
//i/p-->aadhya  o/p-->Aadhya
public class Demo10 {
	public static void main(String[] args) {
		
		String s="aadhya";
		String[] a=s.split("");
		
		a[0]=a[0].toUpperCase();
		String s2=String.join("", a);
		System.out.println(s2);
		
	}

}
