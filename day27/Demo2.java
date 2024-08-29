 package day27;
 //Static block executes during class loading and class is loaded just once no matter 
 //how many objects you create for that class
 class A
 {
	 static int i=10;
	 
	 static 
	 {
		 System.out.println("static block 1");
	 }
	 
	 static 
	 {
		 System.out.println("static block 2");
	 }
	 
	 static 
	 {
		 System.out.println("static block 3");
	 }
 }
 
 public class Demo2
 {
	 public static void main(String[] args)
	 {
		 System.out.println("main starts");
		 System.out.println(A.i);//Class A is first accessed here, so class is loaded at this point 
		 //so static block executes here
		 System.out.println("Hi");
		 A a1=new A();
		 A a2=new A();
		 
		 System.out.println("main end");
	 }
 }

