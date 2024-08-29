package day23;

public class Demo5 {
	
//	final int x; //we get error
	final int x=10;//Initialization is mandatory for final variables
	
	public static void main(String[] args) {
		 final int y=10;
		 
		 System.out.println(y);// Local variables must be initialized -no default value
	}

}
