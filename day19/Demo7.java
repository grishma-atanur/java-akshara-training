package day19;

public class Demo7 {
	
	public static void m1(int[] a)
	{
		System.out.println("m1 starts");
		for(int v:a)
		{
			System.out.println(v);
		}
		System.out.println("m1 ends");
			
	}

	public static void main(String[] args) {
		// i want to call m1 with 2 inputs or 3 inputs or 4 inputs
		//problem is all Method arguments are mandtory
		//solution is to use Array
		
		int[] a= {10};
		m1(a);
		
		int [] b= {10,20,30};
		m1(b);
// m1(); wrong
//m1(10); wrong
//m1(10,20); wrong
	}

}
