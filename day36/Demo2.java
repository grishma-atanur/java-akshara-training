package day36;

//same as Demo1 but write a code which anybody can call
interface Animal1 {
	void makesSound();

	void eat();
}

class Dog1 implements Animal1 {

	@Override
	public void makesSound() {
		System.out.println("Bow Bow");

	}

	@Override
	public void eat() {
		System.out.println("Pedigree");

	}

}

class Cat1 implements Animal1 {

	@Override
	public void makesSound() {
		System.out.println("Meow");

	}

	@Override
	public void eat() {
		System.out.println("Close eyes and drink milk");

	}

}

class Test {
	public static void testAnimal(Animal[] allAnimal) {
		for (Animal animal : allAnimal) {

			animal.makesSound();
			animal.eat();
		}
	}
}

public class Demo2 {
	public static void main(String[] args) {
		// call testAnimal method
		Animal[] a = { new Cat(), new Cat(), new Dog() };//This order can be anything you want,based
		//on this order methods are executed
		Test.testAnimal(a);
	}

}
