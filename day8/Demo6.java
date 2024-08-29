 package day8;
 import java.util.Scanner;

public class Demo6 {
//Accept Character from use
	public static void main(String[] args) {
		
		System.out.println("Hi Please enter a char ");
		Scanner sc= new Scanner(System.in);
		// We have methods to accept from user for all the primitive data types 
		// except for char data type, we need to use another way to accept char.
		
		// sc.nextByte();	
		// sc.nextShort();	
		// sc.nextInt();	
		// sc.nextLong();	
		// sc.nextFloat();	
		// sc.nextDouble();	
		// sc.nextBoolean();	
		
	char c=sc.next().charAt(0);	//0 is an index which takes just first letter
		System.out.println(c);
	}	

}
