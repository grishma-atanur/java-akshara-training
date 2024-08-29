package day11;

public class demo7 {
	public static void main(String[] args) {
		System.out.println("main starts");
		
		int c=1; //Initialization
		for(;;)
		{
			System.out.println(c);/*print c , After printing 91 it stops becuase 
			conditon becomes false that is 101 > 100*/
			c=c+10; //Increment c
			
			if(c>100){ //Condition
				break; // Exit from the for loop
				
			}
			System.out.println("after if");
			
		}
		System.out.println("main ends");
		 
	}

}
