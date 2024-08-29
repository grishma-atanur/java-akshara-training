package day27;
//non-static block execution
public class Demo6 {
	{
		System.out.println("NSB");//non-static block
	}
	public static void main(String[] args)
	{
		System.out.println("main");
		Demo6 d=new Demo6();//non-static block executed once the object is created
	}

}
