package day37;
//car assembly line 
interface Car
{
	void body();
	void engine();
	void interiors();
}

abstract class Line1 implements Car //abstract class
{
	public void body()
	{
		System.out.println("Car body");
	}
}

abstract class Line2 extends Line1 //abstract class
{
	public void engine()
	{
		System.out.println("car engine");
	}
}
class Line3 extends Line2 //concrete class
{
	public void interiors()
	{
		System.out.println("car interiors");
	}
}

public class Demo2 {
	public static void main(String[] args) {
		
		Car mycar=new Line3(); //Autoupcasting
		mycar.body();
		mycar.engine();
		mycar.interiors();
		
	}

}
