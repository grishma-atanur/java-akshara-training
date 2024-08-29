package day13;

public class Demo3 {
	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++)
		{			
			char n = 'A';
			for(int j=1; j<=i;j++)
			{
				char x = 'a';
				System.out.print("[i = " + i + " j = "+ j+ " n = " + n + " x = " + x + "]  ");
				n++;
				x++;
			}
			System.out.println();
		}
	}

}
