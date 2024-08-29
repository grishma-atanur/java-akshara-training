 package day35;
 //Just to explain different combinations -->no code
 class A3
 {
	 
 }
 class B3 extends A3
 {
	 
 }
 
 interface A4
 {
	 
 }
 
 interface B4 extends A4
 {
	 
 }
 
interface A5
{
	
}

class B5 implements A5
{
	
}
 
 
public class Demo3 {
	
	public static void main(String[] args) {
		//parent of class can be interface or class
		//parent of an interface must be another interface only
		
		//class--> class and interface to interface--->extends keyword
		//interface -->class-->Implements
		//class-->xxx-->interface not allowed
	}

}
