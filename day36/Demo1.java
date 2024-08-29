package day36;
//if u want to just list out the functionlities and u dont know the exact behaviour
//unless u have the specific class, u have to go with interface

interface Animal
{
	void makesSound();
	void eat();
}

class Dog implements Animal
{

	@Override
	public void makesSound() {
		System.out.println("Bow Bow");
		
		
	}

	@Override
	public void eat() {
		System.out.println("Pedigree");
		
	}
	
}

class Cat implements Animal
{

	@Override
	public void makesSound() {
	System.out.println("Meow");
		
	}

	@Override
	public void eat() {
	System.out.println("Close eyes and drink milk");
		
	}
	
}
public class Demo1 {
	public static void main(String[] args) {
		Animal[] allAnimal= {new Dog(), new Cat(), new Dog(), new Cat()}; 
		
		for(Animal animal:allAnimal)
		{
			animal.makesSound();  //Runtime polymorphism(JVM will decide)
			animal.eat();
		}
		 
	}

}
