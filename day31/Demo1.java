package day31;
//let anyone create Swamiji object and access car and Pravachana
//but Swamiji and Pravachana should not be inherited
//for that you need to make class Swamiji as final

final class Swamiji
{
	final public int car=10;
	
	public void pravachana()
	{
		System.out.println("this world is nashwara");
	}
}

public class Demo1 {
	public static void main(String[] args) {
		
		Swamiji s1=new Swamiji();
//		s1.car=2 //can't change value of car as it is final
		System.out.println(s1.car);
		s1.pravachana();
	}
}
