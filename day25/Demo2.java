  package day25;
  
  class Employee
  {
	  int id;
	  String name;
	  String city;
	  
	  Employee()
	  {
		  
	  }
	  Employee(int i)
	  {
		  id=1;
	  }
	  Employee(int i, String n)
	  {
		  id=i;
		  name=n;
	  }
	  Employee(int i, String n, String c)
	  {
		  id=i;
		  name=n;
		  city=c;
	  }
  }

public class Demo2 {
public static void main(String[] args) {
	
	Employee e0=new Employee();  
	Employee e1=new Employee(1);
	Employee e2=new Employee(1,"Aakash");
	Employee e3=new Employee(1,"Bharani","Pune");
	
	
	
	
}
}
