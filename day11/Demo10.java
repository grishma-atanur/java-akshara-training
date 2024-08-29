package day11;

public class Demo10 {
	public static void main(String[] args) {
		int c;
		int i;
		for(i=1;i<=2;i++);
		{
			System.out.println(i);
		} 
		/* In above lines please notice ; at end of for,
		what happens here is , the semicolon indicates end of statement, 
		the iteration happens but since there is no body it doesnt go to
		 body after initilisation->condition checkingit tries to enter 
		 for loop body but since there is no body it goes to increment/decrement
		 section, and it increments then again checks condition ...it continues like
		 this untill condition becomes false, then it exits for loop 
		 and then prints i
		 
		 so putting a ; at end of for loop is
		
		* The above program is same as writing as below
		
	*/
		
		for(c=1;c<=2;c++)
		{
			
		}
		System.out.println(c);
		
		}
		
	}


