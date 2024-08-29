package day39;
//String-adding, concetenating, converting string back to integer

public class Demo4
{
public static void main(String[] args) {
		
		int i=10;
		String v=String.valueOf(i); //static method
		String v2="" +i;// converting and concatenating

		System.out.println(i); //10
		System.out.println(v); //10
		
		//Difference
		System.out.println(i+1); //adding
		System.out.println(v+1);//concetenating
		
		System.out.println(v2+1); //concetenating
		
		int j=Integer.valueOf(v); //converting string "10" to integer 10
		System.out.println(j);
		System.out.println(j+1);
		
		
		
	}

}
