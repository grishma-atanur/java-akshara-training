package day44;

import java.util.ArrayDeque;

//ArrayDeque
public class Demo2 {
	public static void main(String[] args) {
		
		ArrayDeque<String> q=new ArrayDeque<String> ();
		q.offerFirst("A");
		System.out.println(q); //A
		q.offerLast("B");
		System.out.println(q);//AB
		q.offerFirst("C");
		System.out.println(q);//C A B
		q.offerLast("D");
		System.out.println(q);// C A B D
		
		q.pollFirst();
		System.out.println(q); //A B D
		q.pollLast();
		System.out.println(q); //A B 
		q.pollFirst();
		System.out.println(q);// B
		q.pollLast();
		System.out.println(q); //[]
		
		}

}
