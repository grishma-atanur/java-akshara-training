package day13;

public class Demo12 {
	/* Parellogram- Logic remains same as Demo10, only difference is for second j loop instead of "j<=i"
	should be j<=4*/
	
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++) //space remains same as in Demo10
			{
				System.out.print(" ");
			}
			for(int j=1;j<=4;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}