package day31;

class Animal2 {
	void makeSound() // Method present both in Parent and child
	{
		System.out.println("Animal makes some sound");
	}

}

class Dog extends Animal2 {
	@Override
	void makeSound() // Method present both in Parent and child
	{
		System.out.println("Dog makes sound : Bow Bow");
	}
}

public class Demo7 {
	public static void main(String[] args) {

		Animal2 a1 = new Animal2();
		a1.makeSound(); // Animal makes some sound

		Dog d1 = new Dog();
		d1.makeSound(); // Dog makes sound : Bow Bow

		Animal2 a2 = (Animal2) d1; //Up-casting-converting dog(child) object to Animal(Parent)type 
		a2.makeSound(); // Dog makes sound : Bow Bow

	}

}
