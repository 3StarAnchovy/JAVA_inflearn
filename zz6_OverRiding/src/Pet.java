class Animal {
	String name;
	int age;

	void printPet() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class Dog extends Animal {
	String varitey;

	// 오버라이딩, 덮어써버림
	void printPet() {
		super.printPet(); // 자기의 상위 클래스 메소드 호출
		System.out.println("종류 : " + varitey);
	}
}

public class Pet {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "진돌이";
		dog.age = 5;
		dog.varitey = "진돗개";
		dog.printPet();
	}

}
