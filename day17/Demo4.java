package day17;

public class Demo4 {
	//using Methods-first program
	//in java we can write method inside a method
	public static void m1()//head ->Method declaration
	{
		//body-Method definition/Implementation
		System.out.println("bye");
	}
	
	public static void main(String[] args) {
		System.out.println("Main starts");
		Demo4.m1();// official syntax for calling a method
		m1(); //calling m1 method-this also works as main method and m1 method are in 
		//same class-Demo4
		m2(); 
		Demo4.m2();
		System.out.println("Main ends");
		}
  
		public static void m2() {
			System.out.println("m1 of Demo4");
		}
}

