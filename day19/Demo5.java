 package day19;
//write a recursive method to get sum of n numbers
 //input 0-->0
 //input 1-->1+0
 //input 2-->2+1+0
 //input 3-->3+2+1+0
public class Demo5 {
	
//	public static int m1(int n)
//	{
//		if(n>0)
//		{
//			int sum=n+m1(n-1);
//			return sum;
//		}
//		else {
//			return 0;
//		}
//	}
	
	//optimised code of above....
		public static int sum(int n)
		{
			if(n>0)
			{
				return n+sum(n-1);
			}
			else
			{
				return 0;
			}
		}
		
		public static void main(String[] args) {
			
		
			System.out.println(sum(3));
		}

}
