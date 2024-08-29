package day32;
class Shape
{
	void calculateArea()
	{
		System.out.println("use formula to calculate area");
	}
}

class rectangle extends Shape{
	int l;
	int b;
	rectangle(int l, int b)
	{
		this .l=l;
		this.b=b;
		}
	
	void calculateArea()
	{
		int area=l*b;
		System.out.println("Area of Rectangle is: " +area);
	}
}

class Circle extends Shape{
	int r;
	Circle(int r)
	{
		this.r=r;
	}
	
	void calculateArea()
	{
		double area=3.14*r*r;
		System.out.println("Area of Circle is: " +area);
	}
}

class Triangle extends Shape{
	int l,b;
	Triangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	void calculateArea()
	{
		double area=0.5*l*b;
		System.out.println("Area of Triangle   is: " +area);
	}
}
class Student
{
	static void findArea(Shape shape)   
	{
		shape.calculateArea();
	}
}

public class Demo5 {
	public static void main(String[] args) {
		
		Shape[] allShapes= {new rectangle(10,20), new Circle(20), new Triangle(10,20)};
		
		for(Shape shape: allShapes)
		{
			Student.findArea(shape);
		}
		 
	}

}
