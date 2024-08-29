package day33;

//Example of overloading main method

public class Demo6 {
	public static void main(String[] args) {
		
		System.out.println("Hi");
		main(10);
	}

	public static void main(int args)
	{
		System.out.println("bye");
	}
}
