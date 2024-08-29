package day31;
//When Method present only in Parent
//Upcasting- converting child class object to parent type(parent type can be anything 
//class,Abstract class, Interface)
class Animal {
	void makeSound() { //Method present only in Parent
		System.out.println("Animal makes sound");
	}
}

class Cat extends Animal {

}

public class Demo6 {
	public static void main(String[] args) {
		
		Animal a=new Animal();
		a.makeSound();
		
		Cat c1 = new Cat();
		c1.makeSound();

		Animal a1 = (Animal) c1; // Upcasting
		a1.makeSound();
	}

}
