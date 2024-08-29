  package day31;
  //Instead of creating 1 more method to get Emp details we override inbuilt
  //toString() method(that is we change its  behavior from 
  //returning address to returning values)
  
  class Emp{
	  int id;
	  String name;
	  
	  Emp(int id,String name)
	  {
		  this.id=10;
	  this.name=name;
	  }
	  @Override 
	  public String toString() //inbuilt toString() method overridden
	  {
		  return id+"-"+name;
	  }
  }

public class Demo4 {
	public static void main(String[] args) {
		
		Emp e1=new Emp(1,"Grishma");
		System.out.println(e1);
	}

}
