package day45;
//In HashMap insertion order is not preserved but in LinkedHashMap insertion order is preserved
//for sorting order go with TreeMap
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Demo3 {
	public static void main(String[] args) {
		HashMap<String,Integer> items=new HashMap<String, Integer>();
		System.out.println(items.size());//0
		items.put("Chair", 100);//0
		items.put("Table", 2);
		items.put("Table", 3);//overrides first table
		items.put("Marker", 25);
		items.put("marker", 25);
		items.put("Projector", null); //null is allowed
		items.put("Ac", null);//multiple nulls are allowed
		
		
		
		System.out.println(items.size());//4
		System.out.println(items); 
		
		//LinkedHashMap-insertion order preserved
		System.out.println("LinkedHashMap");
		LinkedHashMap<String,Integer> items2=new LinkedHashMap<String, Integer>();
		System.out.println(items2.size());//0
		items2.put("Chair", 100);//0
		items2.put("Table", 2);
		items2.put("Table", 3);//overrides first table
		items2.put("Marker", 25);
		items2.put("marker", 25);
		items2.put("Projector", null);
		items2.put("Ac", null);
		System.out.println(items2.size());//4
		System.out.println(items2); 
		
		//TreeMap-sorting order of key , it supports for String coz String class implements 
		//comparable interface
		System.out.println("TreeMap");
		TreeMap<String, Integer> items3=new TreeMap<String,Integer> ();
		System.out.println(items3.size());//0
		items3.put("Chair", 100);//0
		items3.put("Table", 2);
		items3.put("Table", 3);//overrides first table
		items3.put("Marker", 25);
		items3.put("marker", 25);
		items3.put("Projector", null);
		items3.put("Ac", null);
		System.out.println(items3.size());//4
		System.out.println(items3); 
		
	}

}
