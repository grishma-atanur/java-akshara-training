package day24;

//Local variable is accessed(Preferred) over Global variable

class G
{
	int i=10; // Global variable
	int j=20; //Global Variable
	
	G()
	{
		int j=30; //Local variable
		System.out.println(i); //10
		System.out.println(j); //30
	}
}

public class Demo5 {

	public static void main(String[] args) {
		 new G();/*this is also valid java statement, here we are just creating object
		 * of G and calling constructor but we are not storing the address of object G anywhere
		 so we cannot reuse it again*/

	}

}
