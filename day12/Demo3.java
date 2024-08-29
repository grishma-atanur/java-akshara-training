package day12;

public class Demo3 {
	public static void main(String[] args) {
		
	for (int i=1;i<=10;i++)
	{
		if(i>3 && i<7)
		{
			continue; /*it will go to next iteration 
			/that is from here it goes to update section that is "I++" */
		}
		System.out.println(i);
	}
	}

}
