package day46;
//Graceful termination:Exception occurred and handled
public class Demo3 {
	public static String s; // s is not initialsed
	public static void main(String[] args) {
		System.out.println("Main starts");
		try
		{
		int l=s.length(); //risky code
		System.out.println(l);
		}
		catch(Exception e) //Exception handled
		{
			System.out.println("Hi i got exception"); //recovery code
		}
		System.out.println("Main ends");
		 
		
	}

}
