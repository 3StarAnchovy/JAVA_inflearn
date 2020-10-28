
abstract class Animal {
	int age;

	abstract void cry();
}

class Dog extends Animal {
	void cry() {
		System.out.println("…³");
	}
}

class Cat extends Animal {
	void cry() {
		System.out.println("²ó²ó");
	}
}


public class AbstractClassEx {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.cry();
		
		Cat cat = new Cat();
		cat.cry();
	}
}
