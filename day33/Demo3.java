package day33;

class Emp{
	
 public static final String company= "Akshara";
}

public class Demo3 {

	public static void main(String[] args) {
		
	//	String v=Emp.company; we can optimize these 3 lines of code like below
	//	int l=v.length();
	//	System.out.println(l);
		
	int l= Emp.company.length();
	System.out.println(l);
	}
}
