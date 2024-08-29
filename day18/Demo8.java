package day18;

public class Demo8 {
	
	public static void add(double i, double j, double...a)//used ellipses
	{
		//i and j are mandatory values to be provided and 
		//for(double...a) you can give any number of arguments and it is optional 
		 
		double sum=i+j;
		for(double v:a)// for each loop, a is array
		{
			sum=sum+v;
		}
		System.out.println(sum);
	}
	
		public static void main(String[] args) {
			
			add(10,20);
		//	     i, j
			add(10,20,30);
		//	     i, j, a[0]
			
			add(10,20,30,40);
		//	     i ,j,a[0],a[1]	
			add(10.2,20,30,40);
		//		            a[2]
		}

}
