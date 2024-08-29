package day11;


//Fall through Switch
public class Demo2 {
	public static void main(String[] args) {
		int option=1;
		
		switch(option)
		{
		default: 
			System.out.println("case default");
			
		case 1:
			System.out.println("case 1 body");
			
		case 2:
			System.out.println("case 2 body");
		
	}
}
}
