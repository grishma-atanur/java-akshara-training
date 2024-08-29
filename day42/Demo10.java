package day42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo10 {
	//Print the list in sorted order (case insensitive order)
	public static void main(String[] args) {
		List<String> allCity=new ArrayList<String>();
		allCity.add("Bengaluru");
		allCity.add("delhi");
		allCity.add("Chennai");
		allCity.add("Mumbai");
		allCity.add("agra");
		
		System.out.println(allCity);
		
		Collections.sort(allCity);
		System.out.println(allCity);
		
		Collections.sort(allCity,String.CASE_INSENSITIVE_ORDER); //Method overloading 
		System.out.println(allCity);
	}

}
