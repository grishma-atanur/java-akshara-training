 package day27;
 //First example of INHERITANCE
 class Parent //Parent class =Base class= Super class
 {
	 int i=10;
 }
 class child extends Parent //sub class=child class
 {
	 
 }
public class Demo9 { 
	public static void main(String[] args) {
		 Parent p=new Parent();
		 System.out.println(p.i);
		 
		 child c=new child();
		 System.out.println(c.i);
	}

}
