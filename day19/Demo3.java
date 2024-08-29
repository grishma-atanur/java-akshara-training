package day19;
//Write a recursive method to print numbers from 1 to 10
// i/p should be 10
//o/p should be 1 2 3 4 5 6 7 8 9  10
public class Demo3 {
	
	public static void myForLoop(int n)
	{
		if(n>=1)
		{
			int temp=n-1;
			myForLoop(temp);
			System.out.println(n);
		}
//	else
//	{
//			System.out.println("End");
//		}
	}
	public static void main(String[] args) {
		
		myForLoop(10);
	}

}
