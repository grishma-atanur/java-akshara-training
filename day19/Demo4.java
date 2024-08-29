package day19;
//write recursive method to print alternate backward numbers
//10 8 6 4 2
public class Demo4 {
		public static void myForLoop(int n)
		{
			if(n<=0)
			{
				System.out.println("End");
			}
			else
			{
				System.out.println(n);
				n=n-2;
				myForLoop(n);
			}
		}
		public static void main(String[] args) {
			
			myForLoop(10);
		}
}


