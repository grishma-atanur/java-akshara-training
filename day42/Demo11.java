package day42;

import java.util.ArrayList;
import java.util.List;

class Emp
{
	int id;
	String name;
	
	Emp(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return name+ "_	" + id;
	}
	
}

public class Demo11 {
	public static void main(String[] args) {
		Emp e1=new Emp(1, "Grishma");
		Emp e2=new Emp(2, "Aadhya");
		Emp e3=new Emp(3, "Viresh ");
		
		List<Emp> allEmp = new ArrayList <Emp> (); 
		allEmp.add(e1); //this prints address so we need to override the toString method
		allEmp.add(e2);
		allEmp.add(e3);
		
		System.out.println(allEmp);
		}

}
