package day45;
//HashMap compared to arrayList 
import java.util.ArrayList;
import java.util.HashMap;

public class Demo1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> items1=new ArrayList<Integer>();
		items1.add(3);//3projectors //cant make out which items is added here
		items1.add(100);//100chairs
		items1.add(25);//25 markers
		
		System.out.println(items1.get(0));
		System.out.println(items1.get(1));
		System.out.println(items1.get(2));
		
		System.out.println(items1);
		
		System.out.println("-------");
		//using HashMap we can make out which item is added(stores as key value pair)
		HashMap<String, Integer> items2=new HashMap<String, Integer>();
		items2.put("Projector", 3);//in Maps instead of using add we use put
		items2.put("Chair", 100);
		items2.put("Marker", 25);
		
		System.out.println(items2.get("Projector")); 
		System.out.println(items2.get("Chair"));
		System.out.println(items2.get("Marker"));
		System.out.println(items2);
		
	}

}
