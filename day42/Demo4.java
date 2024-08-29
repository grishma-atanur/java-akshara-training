package day42;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {
	public static void main(String[] args) {

		List <String> a= new ArrayList<String>(); 
		a.add("Apple");
		a.add("Banana");
		a.add("Mango");
	System.out.println(a.indexOf("Apple")); //0
	System.out.println(a.indexOf("Mango"));//2
	System.out.println(a.indexOf("Papaya"));//-1
	System.out.println(a.contains("Apple")); //true
	System.out.println(a.contains("Papaya")); //false
	System.out.println(a.contains("Man"));//false its not Searching for substring 
	//it is looking for complete batch, but contains is different in String, it looks for substring
	
	//To compare two lists aresame or not
	List <String> b= new ArrayList<String> (a);
	System.out.println(a);
	System.out.println(b);
	
	System.out.println(a.equals(b)); //True only if Size , content and order are same
	
	List<String> c=new ArrayList<String> ();
	a.add("Apple");
	a.add("Mango");
	a.add("Banana");
	
	System.out.println(a.equals(c)); //false -order is different 

	
}
}
