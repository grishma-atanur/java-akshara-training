package day23;

class A
{
	int i=10;
	String s="Grishma";
	int[] a = {10,20};
	
}

public class Demo1 {
	
	static int i=10; //Global variable
	public static void main(String[] args) {
		
		int j=20;//local variable
		System.out.println(i); //accesible anywhere in class
		System.out.println(j);//accesible only in main method and anywhere in main method
		
		{
			int k=10;//accessible only within this curly bracket
			System.out.println(k);
		}
		//System.out.println(k);//error
		
		for(int p=0;p<10;p++)
		{
			System.out.println(p);//p accesible only within for loop
		}
		// System.out.println(p);//error
	}

}
