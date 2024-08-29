package day41;
import java.util.ArrayList;
//iterable->colletin->List  Queue  Set
//List->ArrayList
public class Demo6 {
public static void main(String[] args)
{
	 ArrayList a=new ArrayList(); //Create object of class ArrayList
	 a.add("Apple"); 
	//can add heterogenous items to ArrayList and
	// can add any number of items to Arraylist		
	 //that is we can resize Array list
	 a.add(123);
	 a.add(true);
	 System.out.println(a.size());
	 System.out.println(a); //Prints content
	 a.add(10.56); //again you add to array list
	 
	 Object[] b= {"Apple", 123, true};
	 System.out.println(b.length);
	 System.out.println(b);//Prints address
	 
	 
}
}
