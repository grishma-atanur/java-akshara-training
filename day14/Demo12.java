package day14;

public class Demo12 {
// To Demonstrate do-While loop(exit controlled loop)
	public static void main(String[] args) {
		
		int i=1;
		
		do // enters loop irrespective of any conditon
		{
			System.out.println(i);
			i++;
		} while(i<3);// if conditon is true it loops back else 
		//it exits

	}

}
