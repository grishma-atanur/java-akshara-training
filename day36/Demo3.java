package day36;
//Homework

interface Shape
{
	void findArea();  //in interface every method is public
}

class Circle implements Shape
{
	private int r;
	Circle(int r)
	{
		this.r=r;
	}
	@Override
	public void findArea() {
	 double area=3.14*r*r;
	 System.out.println(area);
		
	}
	
}
class Rectangle implements Shape
{
	public void findArea()
	{
		
	}
}

class TestShape

{
	public static void testShape(Shape[] allShapes)
	{
		for(Shape shape:allShapes)
		{
			shape.findArea();
		}
	}
}

public class Demo3 {
	//call Test Shape method
	

}
