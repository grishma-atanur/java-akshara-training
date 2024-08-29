 package day32;
 //example of Runtime polymorphism-Method overriding
 class Animal{
	 void makeSound()
	 {	 System.out.println("Animal makes sound");

	}
 }

 class Cat extends Animal{
	 void makeSound()
	 {	 System.out.println("Meow Meow");

	}
 }
 
 class Dog extends Animal{
	 void makeSound()
	 {	 System.out.println("Bow Bow");

	}
 }
 
 class Cow extends Animal{
	 void makeSound()
	 {	 System.out.println("Ambooo");

	}
 }
 
 class Land
 {
	 public static void testAnimal(Animal a)
	 {
		 a.makeSound(); //this is called Run time polymorphism-object behaving differently 
		 //under different circumstances
	 }
 }
public class Demo4 {
	public static void main(String[] args) {
		
		Animal[] a= {new Cat(), new Dog(), new Cow()};
		for (int i=0;i<=a.length;i++)
		{
			Land.testAnimal(a[i]);
		}
		
		//same code using for each loop
		for(Animal v:a)
		{
			Land.testAnimal(v);
		}
		
	}

}
