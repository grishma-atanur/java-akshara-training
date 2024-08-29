package day12;

public class Demo6 {
	//Print factorial of the given number 5!
	public static void main(String[] args) {
		int n=5;
		int facct=1;
		for(int i=1;i<=n;i++)
		{
			facct*=i;//facct=facct*i
		}
		System.out.println(facct);
	}

}
