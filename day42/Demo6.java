package day42;
//Irrespective of any order if everything is matching then it should return true
import java.util.ArrayList;
import java.util.List;
//equalIgnoreCase-Interview Question

public class Demo6 {
	public static boolean compare(List<String> a, List<String> b)
	{
		boolean same=true;
		if(a.size()!=b.size())
		{
			return false;
		}
		for(int i=0;i<a.size();i++)
		{
			String s1=a.get(i);
			
			if(!b.contains(s1))
			{
				same=false;
				break;
			}
				}
		return same;
	}
	public static void main(String[] args) {
		List <String> a= new ArrayList<String>(); 
		a.add("Apple");
		a.add("Banana");
		a.add("Mango");
		
		List <String> b= new ArrayList<String>(); 
		b.add("Banana");
		b.add("Apple");		
		b.add("Mango");
		
		boolean result = compare(a,b);
		System.out.println(result);
		
		
		List <String> c= new ArrayList<String>(); 
		c.add("Grapes");
		c.add("Apple");		
		c.add("Mango");
		
		result = compare(a,c);
		System.out.println(result);
		
		
		
	}

}
