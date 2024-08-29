 package day19;
//Method calling itself
public class Demo1 {
	public static void m1(int i)
	{
		//it will not go into infinite loop
		//coz we used decrement i=i-1 and also coz of if condition
		if(i<=0)
		{
			System.out.println("End");
		}
		else
		{
			System.out.println(i);
			i=i-1;
			m1(i);
		}
	}
	
	public static void main(String[] args) {
		
		m1(10);
	}
}
