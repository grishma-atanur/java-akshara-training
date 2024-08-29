 package day42;
//Creating ArrayList using existing ArrayList
 //operations-add,addAll, removeAll
import java.util.ArrayList;
import java.util.List;

public class Demo3 {
	public static void main(String[] args) {

	List <String> a= new ArrayList<String>(); 
	a.add("Apple");//adds at the ends
	a.add("Banana");
	a.add("Mango");
	
	List <String> b= new ArrayList<String>(a); 
	System.out.println(b);
	
	List<String> c=new ArrayList<String>();
	c.add("Tomato");
	c.addAll(a); //add all the objects present in another list to this list
	
	System.out.println(c);
	
	c.removeAll(a);
	System.out.println(c);
	
	List<String> d= new ArrayList<String>(c);
	c.removeAll(a);
	System.out.println(c); //Tomato
	System.out.println(c.isEmpty());//false
	d.clear();
	 
	System.out.println(d);  //[]
	System.out.println(d.isEmpty()); //true
}
}
 