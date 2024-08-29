package day18;

public class Demo1 {
	//using Methods withput Method overloading, 
	//all the methods does same operation that is adding
	//but we have to write differnt methods as there are differnt signitures for 
	//each method but method name remains same,
	//the same program can be efficiently using method overloading -Demo2
	
	public static void addInteger(int i,int j) //Adding integers
	{
		System.out.println("Adding int");
		System.out.println(i+j);
	}
	
	public static void addDouble(double i, double j)//Adding decimal
	{
		System.out.println("Adding double");
		System.out.println(i+j);
	}
	
	public static void addStringNumber(String s, int i)//Concatenating
	{
		System.out.println(s+i);
	}
	
	public static void main(String[] args) {
		
		Demo1.addInteger(10,20);
		Demo1.addDouble(10.34,20.20);
		Demo1.addStringNumber("Grishma",10);
	}
}
