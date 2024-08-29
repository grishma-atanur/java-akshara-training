package day43;
//Stack
import java.util.Stack;

public class Demo5 {
	public static void main(String[] args) {
		Stack<String> books=new Stack<String> ();
		
		books.push("Java");
		books.push("Python");
		books.push("SQl");
		System.out.println(books);
		System.out.println(books.peek());
		System.out.println("Removing:" +books.pop());
		System.out.println(books);
		System.out.println("Removing" + books.pop());
		System.out.println(books);
		System.out.println("Removing" +books.pop());
		System.out.println(books); //[]
		books.pop(); //Empty stack exception		
	}

}
