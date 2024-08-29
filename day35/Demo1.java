 package day35;
 //First example of Interface
 
 interface A
 {
	 int I=10; //by default it is public static final also global variable
	 
	 public static final int J=20; 
	 
	 String S=new String("Grishma");//Creating object of different class is allowed 
 }
 

public class Demo1 {
public static void main(String[] args) {
	
	System.out.println(A.I);
	System.out.println(A.J);
	System.out.println(A.S);
}
}
