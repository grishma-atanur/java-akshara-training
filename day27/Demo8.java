package day27;
//which is executed first

public class Demo8 {
	static int i=10;
	int j=20;
	Demo8()
	
	{
		System.out.println("UDC");//4
	}
	static //1
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");//3
	}
public static void main(String[] args) {
	System.out.println("main"); //2
	Demo8 d=new Demo8();
	System.out.println(d.i);//5
	System.out.println(d.j);//6
}
}
