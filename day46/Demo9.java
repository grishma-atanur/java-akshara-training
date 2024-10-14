package day46;
//if u want to delay the execution by 2seconds use sleep method present in Thread class
public class Demo9 {
	public static void main(String[] args) {
		
		System.out.println("Main starts");
		try
		{
			Thread.sleep(2000);// in miliseconds, interrupted exception
		}
		catch(Exception e)
		{
			
		}
		System.out.println("Hi");
		System.out.println("Main ends");
		
	}

}
 