package day45;

import java.util.LinkedHashMap;
import java.util.Set;

public class Demo5 {
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
		
		Set<String> allKeys=items.keySet(); //returns all keys and data type depends on
		//Key data type
		System.out.println(allKeys.size());//6
		System.out.println(allKeys);
		System.out.println("-----");
		
		for(String key:allKeys) //to get all the keys one by one
		{
			System.out.println(key);
		}
	}
		

}
