  package day19;
//Print numbers from 100 to 1 without using looping statements like
  //for or if
public class Demo2 {
	public static void m1(int i)
	{
		
		if(i>0)
		{
			System.out.println(i);
			i=i-1;
			m1(i);
		}
	}
	
	public static void main(String[] args) {
		
		m1(100);
	}
}
