package day13;

public class Demo10 {
	public static void main(String[] args) {
		//Print equilateral triangle
		
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
			System.out.print("* ");
		}
			System.out.println();
		
	}

}
}
