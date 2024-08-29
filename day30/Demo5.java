 package day30;
 //Example of Method overriding
 
 class Father
 {
	 void marriage()
	 {
		 System.out.println("Arranged Marriage");
	 }
	 
	 void property()
	 {
		 System.out.println("House Land Gold FD shares car Bike");
	 }
 }
 
 class Son extends Father
 {
	 @Override //annotation
	 void marriage()
	 {
		 
		 System.out.println("Love Marriage"); //Method Overriding
	 }
 }

public class Demo5 {
	public static void main(String[] args) {
		
		Son s1=new Son();
		s1.property();
		s1.marriage();
	}

}
