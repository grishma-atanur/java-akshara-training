package day18;

public class Demo5 {
	
	public static void CalculateArea(int length, int breadth)
	{
		int area=length*breadth;
		System.out.println("Area of Rectangle is " +area);
	}
	
	public static void  CalculateArea(double base, double height)
	{
		double area=0.5*(base*height);
		System.out.println("Area of Triangle is " +area);
		
	}
	public static void CalculateArea(double radius)
	{
		double area= Math.PI*radius*radius;
		System.out.println("Area of Circle is " +area);
		
	}
	
	public static void main(String[] args) {
		
		CalculateArea(10,20);
		CalculateArea(8);
		CalculateArea(3.4,4);//Second argument int is promoted to double by compiler-
		//Auto-promotion
	
	}

}
