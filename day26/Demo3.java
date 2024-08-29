 package day26;
//Difference between calling a static Method and non static Method
 //Static Method-->We call it using class name(recommended) and also using 
 //object name(refrence variable)
 //non-static Method-->We call it using object name(refrence variable only)

 class B
 {
	 //static method
	 
	 public static void m1()
	 {
		 System.out.println("M1 of B");
	 }
	 
	 //non-static method
	 public void m2()
	 {
		 System.out.println("M2 of B");
	 }
 }
 
 public class Demo3 {
	 public static void main(String[] args) {
		 
		 B.m1();//calling a static method(Recommended)
		 B b1=new B();
		 b1.m1();// calling non static method using reference variable(Not recemended)
		 
		 
		 b1.m2();//Calling non static method
		 
	}

}
