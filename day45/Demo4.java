package day45;
//Linked HashMap
import java.util.LinkedHashMap;

public class Demo4 {
	public static void main(String[] args)
	
	{
		LinkedHashMap<String, Integer> items=new LinkedHashMap<String, Integer>();
		
		items.put("Chair",100);
		items.put("Table",2);
		items.put("Table",3);
		items.put("Marker",25);
		items.put("marker",25);
		items.put("Projector",null);
		items.put("AC",null);
		
		System.out.println(items.containsKey("Table")); //True
		System.out.println(items.containsKey("Fan"));//false
		
		
		System.out.println(items.containsKey(100)); //true
		System.out.println(items.containsKey(null)); //true
		System.out.println(items.containsKey(25));//true
		System.out.println(items.containsKey(7));//false
		System.out.println(items.containsKey("25"));//false
		
	}
}
