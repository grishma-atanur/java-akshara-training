package day17;

public class Demo7 {
	//Stackoverflow Exception - please ensure it 
	//doesnt get into infinite loop
	public static void main(String[] args) {
		m1();
		
	}
	
	public static void m1()
	{
		m2();
	}
	
	public static void m2()
	{
		m1();
	}
}
