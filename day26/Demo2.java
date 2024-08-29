 package day26;
 //Interview Question -->Count the number of objects created
 //make ObjtCount variable static so that it is used as common variable across 
 //all objects
 class A
 
 {
	 static int objtCount=0;
	 
	 A()
	 {
		 objtCount++;
	 }
 }

public class Demo2 {
	
	public static void main(String[] args) {
		
		A a1=new A();
		A a2=new A();
		A a3=new A();
		System.out.println(A.objtCount);
	}

}
