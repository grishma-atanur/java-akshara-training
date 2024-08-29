package day42;

import java.util.ArrayList;
import java.util.List;
//equalIgnoreCase-Interview Question

public class Demo5 {
	public static boolean equalIgnoreCase(List<String> a, List<String> b)
	{
		boolean same=true;
		if(a.size()!=b.size())
		{
			return false;
		}
		for(int i=0;i<a.size();i++)
		{
			String s1=a.get(i);
			String s2=b.get(i);
			if(!s1.equalsIgnoreCase(s2))
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
		b.add("Apple");
		b.add("Grapes");
		b.add("Mango");
		
		boolean result =equalIgnoreCase(a,b);
		System.out.println(result); //false---Different object
		
		List<String> c=new ArrayList<String>();
		a.add("apple");
		a.add("banana");
		a.add("mango");
		
		result=equalIgnoreCase(a,c);
		System.out.println(result);//true
		
		List <String> d= new ArrayList<String>(); 
		d.add("Apple");
		d.add("Banana");
		result=equalIgnoreCase(a,d);
		System.out.println(result);//false -->number of objs are different
		
		List <String> e= new ArrayList<String>(); 
		e.add("Banana");
		e.add("Apple");
		e.add("Mango");
		result=equalIgnoreCase(a,e);
		System.out.println(result);//false-order is different
		
		
	}

}
