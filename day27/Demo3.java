 package day27;
 //Interview Question - static block is executed first or
//main method is executed first --> if static block and main method are present in the same class
 // then static block is executed first else its reverse

public class Demo3 {
	
	static 
	{
		System.out.println("static block");
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
	}

}
