
interface Cry {
	void cry(); // abstract
}

class Cat implements Cry {

	@Override
	public void cry() {
		System.out.println("�߿�");
	}
}

class Dog implements Cry {
	@Override
	public void cry() {
		System.out.println("�տ�");
	}
}

public class CheckCry {

	public static void main(String[] args) {
		//Cry test1 = new Cat();
		Cry test1 = new Dog();
		if (test1 instanceof Cat) {
			test1.cry();
		} else {
			System.out.println("����̰� �ƴմϴ�.");
		}
	}

}
