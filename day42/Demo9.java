package day42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo9 {
	//Print the list in sorted order Integer
	public static void main(String[] args) {
		List<Integer> allNumber =new ArrayList<Integer>();
		allNumber.add(10);
		allNumber.add(3);
		allNumber.add(45);
		allNumber.add(76);
		allNumber.add(4);
		
		System.out.println(allNumber);
		
		Collections.sort(allNumber);
		System.out.println(allNumber);
		
		
	}

}
