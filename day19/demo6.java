package day19;
//Write a recursive method to get factorial of a number 
//Note: stop at 1, if you go till 0 everything will be 0
public class demo6 {
	
	public static int factorial(int n)
	{
		if(n>0)
		{
			return n*factorial(n-1);
		}
		else
		{
			return 1;
		}
	}
	
	public static void main(String[] args) {
		
	
		System.out.println(factorial(3));
	}


}
