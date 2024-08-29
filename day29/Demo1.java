  package day29;
  //Explaining Is-A and Has-A Relationship
  class Belt
  {
	  
  }
  
  class Animal
  {
	  
  }
  
  class Dog extends Animal
  {
	  Belt b= new Belt();
  }
  //Parent-> Animal ;Child->Dog
  //Dog is an Animal ->Is-A Relationship

  class Fruit
  {
	  
  }
  class Apple extends Fruit
  {
	  String name="Pink Apple";
  }
public class Demo1 {
	public static void main(String[] args) {
	//Dog Is-A Animal
	//Dog Has-A Belt
	//Apple Is-A Fruit
	//Apple Has-A name(String) //Remember String is an in-built class	
	}

}
