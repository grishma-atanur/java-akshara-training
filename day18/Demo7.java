package day18;

public class Demo7 {
	//Create a method called add, which should add either 2 or 3 numbers
	//It should work for both
	//written same prog efficiently using ellipses in Demo 8
	
	public static void add(int n1, int n2,int n3)
	{
		int sum=n1+n2+n3;
		System.out.println("sum is " +sum);
	}
	public static void add(int n1, int n2)
	{
		int sum=n1+n2;
		System.out.println("sum is " +sum);
	}
	public static void main(String[] args) {
		
		add(10,20,30);
		add(10,20);
	}

}
