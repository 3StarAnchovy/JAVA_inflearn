class Animal {
	String name;
	int age;

	void printPet() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}

class Dog extends Animal {
	String varitey;

	// �������̵�, ��������
	void printPet() {
		super.printPet(); // �ڱ��� ���� Ŭ���� �޼ҵ� ȣ��
		System.out.println("���� : " + varitey);
	}
}

public class Pet {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "������";
		dog.age = 5;
		dog.varitey = "������";
		dog.printPet();
	}

}
