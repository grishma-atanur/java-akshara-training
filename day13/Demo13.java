package day13;

public class Demo13 {
	public static void main(String[] args) {
		//Print inverted equilateral triangle
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=4;j>=i;j--)
			{
			System.out.print("* ");
		}
			System.out.println();
		
	}

}
}
/*for(int i=4;i>=1;i++) changed just i loop
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
*/


