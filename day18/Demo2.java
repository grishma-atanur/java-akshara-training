package day18;

public class Demo2 {
	//used Method overloading for Demo 1 program
	//same method name with different signatures
	
	public static void add(int i,int j) //Adding integers
	{
		System.out.println("Adding int");
		System.out.println(i+j);
	}
	
	public static void add(double i, double j)//Adding decimal
	{
		System.out.println("Adding double");
		System.out.println(i+j);
	}
	
	public static void add(String s, int i)//Concatenating
	{
		System.out.println(s+i);
	}
public static void main(String[] args) {
		
		Demo2.add(10,20);
		Demo2.add(10.34,20.20);
		Demo2.add("Grishma",10);
	}
	

}
