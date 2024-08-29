  package day9;
  import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Main starts"); 
		Scanner sc=new Scanner(System.in);
		
		//accept i
		System.out.println("Enter i value");
		int i=sc.nextInt();
		//accept j
		System.out.println("Enter J value");
		int j=sc.nextInt();
		
		if(i>j)
		{
			System.out.println("i is greater than j");
			
		}
		else {
			System.out.println("i is less than j");
		}
		System.out.println("Main ends");
		

	}

}
