package day44;

import java.util.PriorityQueue;

public class Demo3 {
	public static void main(String[] args) {
		
		PriorityQueue<String> q=new PriorityQueue<String> ();
		q.offer("Aahdhya");
		q.offer("Viresh");
		q.offer("Grishma");
		System.out.println(q); //before sorting random O/P
		
		System.out.println(q.poll()); //sorts based on priority
		System.out.println(q.poll());
		System.out.println(q.poll());
		
	}

}
