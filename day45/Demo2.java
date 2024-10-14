package day45;
//In HashMap insertion order is not preserved
import java.util.HashMap;

public class Demo2 {
	public static void main(String[] args) {
		HashMap<String,Integer> items=new HashMap<String, Integer>();
		System.out.println(items.size());//0
		items.put("Chair", 100);//0
		items.put("Table", 2);
		items.put("Table", 3);//overrides first table
		items.put("Marker", 25);
		items.put("marker", 25);
		System.out.println(items.size());//4
		System.out.println(items); 
	}

}
