package day42;
//ArrayList operations-add,remove,set
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	public static void main(String[] args) {
		
		List<String> a= new ArrayList<String>();
		a.add("Apple");//adds at the ends
		a.add("Banana");
		a.add("Mango");
		a.add("Chiku");
		a.add("Grapes");
		a.add("Grapes");
		a.add(null); //null is allowed
		a.add(null); //null is allowed
		System.out.println(a.size());
		System.out.println(a);
		a.add(1,"Orange");//adds at the specified index(insert)
		System.out.println(a);
		a.set(0, "Red Apple");//Change/replace/edit
		System.out.println(a);
		a.remove(0);//remove based on index
		System.out.println(a);
		a.remove("Orange"); //remove based on objeect-1st occurence
		a.remove("Grapes");
		System.out.println(a);
		a.remove(-1); //IndexOutOfBoundsException
		System.out.println(a.remove("Papaya"));
		
		
	}

}
