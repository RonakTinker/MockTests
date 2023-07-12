package in.ineuron.Problems;

abstract class Animal{
	public void makeSound() {
		System.out.println("the sound made by animal");
	}
}

class Dog extends Animal{
	public void makeSound() {
		System.out.println("the sound made by dog");
	}
}

class Cat extends Animal{
	public void makeSound() {
		System.out.println("the sound made by cat");
	}
}

class Cow extends Animal{
	public void makeSound() {
		System.out.println("the sound made by cow");
	}
}

public class Problem1 {

	public static void main(String[] args) {
		
		Animal dog=new Dog();
		Animal cat=new Cat();
		Animal cow=new Cow();
		
		dog.makeSound();
		cat.makeSound();
		cow.makeSound();

	}

}
