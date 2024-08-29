 package day25;
/*when the name of global and local variable are same
 * and we need to access Global variable 
 * then we use "this" keyword
 */
 
 class MyBaby
 {
	 String name;
	 MyBaby(String name)
	 {
		 this.name=name;
		 
	 }
 }
public class Demo6 {
	public static void main(String[] args) {
		
	

	MyBaby b1=new MyBaby("Akshara");
	System.out.println(b1.name);
}
}
