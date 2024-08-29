package day31;
//o/p when toString() method is overrided and o/p when toString() 
//method is not overrided
//Note : toString() method is built-in which is present in Object class(built-in class
//which every user  defined class inherits)
class C
{
	
}

class D
{
	 public String toString() //overriding
	 {
		 String s=super.toString(); //stores address;here super refers to object class 
		 String msg="Hi Grishma address is " + s;
		 return msg;
	 }
}
public class Demo3 {
	public static void main(String[] args) {
		
		C c1=new C();
		String addr=c1.toString();
		System.out.println(addr);
		
		D d1=new D();
		String addr2=d1.toString();
		System.out.println(addr2);
		
		System.out.println(d1);
	}

}
