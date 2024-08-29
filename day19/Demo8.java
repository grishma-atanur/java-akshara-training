 package day19;
//var args
public class Demo8 {
//same program as Demo 7 but here we use ellipses so that we can pass any number of arguments
	//also we can pass with no arguments 
	
	public static void m1(int...a)//internally a is stored as an array...any number of ints  
	{
		System.out.println("m1 starts");
		System.out.println("Number os elements:" +a.length);
		for(int v:a)
		{
			System.out.println(v);
		}
		System.out.println("m1 ends");
			
	}

	public static void main(String[] args) {
		// i want to call m1 with 2 inputs or 3 inputs or 4 inputs
		//problem is all Method arguments are  mandatory
		//solution is to use Array
		
		m1(); //when we use ellipses we can call with empty args
		m1(10); //When we use ellipses we can directly call with value
		m1(10,20); //we can call with any number of args
		m1(10,20,30,40);
// m
	}

}
