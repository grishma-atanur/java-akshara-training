package day40;
//Interview question
//Convert "Grishma-123" into "grishma-123" without using toUpperCase method
public class Demo12 {
	public static void main(String[] args) {
		
		String s="Grishma-123";
		 for(char c:s.toCharArray()) //get all the chars into array first
		 {
			 if(c>='a' && c<='z')   //check if it is lower case
				 
			 {
				 char b=(char)(c-32);
				System.out.print(b);
			 }
			 else  //if its not lower case print as it
			 {
				 System.out.print(c);
			 }
		 }
		
	}

}
