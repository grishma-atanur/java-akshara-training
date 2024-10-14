package day45;
//very important Interview-get number of lidlis and dosas
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;


public class Demo7 {
	public static void main(String[] args) {
		ArrayList<String> breakfast= new ArrayList<String>();
		breakfast.add("Idly");
		breakfast.add("Dose");
		breakfast.add("Vade");
		breakfast.add("Poori");
		breakfast.add("Pongal");
		breakfast.add("Dose");
		breakfast.add("Dose");
		breakfast.add("Idly");
		
		LinkedHashMap<String, Integer> food=new LinkedHashMap<String, Integer>();
		
		for(String item:breakfast)
		{
			if(food.containsKey(item))
				
			{
				Integer value=food.get(item);
				value++;
				food.put(item, value);
			}
			else
			{
				food.put(item,1);
			}
			
			}
		System.out.println(food);
		//Print the items present in arraylist without repeating it
		Set<String> allItems=food.keySet();//Use KeySet() method
		System.out.println(allItems);
		
		//Print only duplicate items present in array list
		System.out.println(("Duplicate items"));
		for(String item:allItems)
		{
			Integer value = food.get(item);
			if(value>1)
			{
				System.out.println(item);
			}
		}
		////Print only unique items present in array list
		System.out.println(("Unique items"));
		for(String item:allItems)
		{
			Integer value = food.get(item);
			if(value==1)
			{
				System.out.println(item);
			}
		}
		//Print items present in Arraylist along with its occurence
		System.out.println("items with occurence");
		System.out.println(food);
		
		
	}

}
