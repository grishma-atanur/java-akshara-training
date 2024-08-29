package day23;
class B{
	int i; //initialization is not necessary for global variable
	String s;
}

//Application of Default value to Global and local variable
public class Demo3 {
	
	public static void main(String[] args) {
		 
		int j=10;//initialization is must for local variable otherwise its error
		B b1=new B();
		System.out.println(b1.i);//Prints default value of i
		System.out.println(b1.s);
		System.out.println(j);//prints 10
	}

}
