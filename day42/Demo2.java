 package day42;
 import java.util.ArrayList;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		List <String> a= new ArrayList<String>();
		a.add("Apple");//adds at the ends
		a.add("Banana");
		a.add("Mango");
		String v=a.get(0);
		System.out.println(v);
		System.out.println("-----");
		for(int i=0;i<a.size();i++)
			
		{
			System.out.println(a.get(i));
		}
		System.out.println("----");
		for(String b:a)
		{
			System.out.println(b);
		}
		
	}
	

}
