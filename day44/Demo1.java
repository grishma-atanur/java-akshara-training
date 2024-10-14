package day44;
//Queue 
import java.util.LinkedList;
import java.util.Queue;

public class Demo1 {
	public static void main(String[] args) {
		Queue<String> q=new LinkedList<String>();
		q.offer("A"); //offer means joining the Queue or enter the q
		q.offer("B");
		q.offer("C");
		
		System.out.println(q);
		System.out.println(q.peek());//who is at the top/front of the q
		
		System.out.println(q.poll()); //who exits first
		System.out.println(q);//B C
		System.out.println(q.poll()); //B
		System.out.println(q); //c
		
		System.out.println(q.poll());//c
		System.out.println(q);//[]

		System.out.println(q.poll()); //we dont get any exception but returns null
	}

}
