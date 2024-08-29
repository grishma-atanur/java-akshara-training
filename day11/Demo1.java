 package day11;
 import java.util.Scanner;
/*Switch is faster than if but can be used only for comparison operator (==) 
 not other than that*/ 
public class Demo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter enter number from 1 or 2");
		int option= sc.nextInt();
		sc.close();
		
		switch(option)
		{
		case 1: System.out.println("case 1 body");
		break;// exit switch block
		
		case 2: System.out.println("case 2 body");
		break;
		
		default: System.out.println("default case");
		break;
		}
		
		System.out.println("Main Ends");
		
		
	
	
	if(option==1)
	{
		System.out.println("case 1 body");
	}
	else if(option==2)
	{
		System.out.println("case 2 body");
	}
	else
	{
		System.out.println("Default case");
	}

}
}
