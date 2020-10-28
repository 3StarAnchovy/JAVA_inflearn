package Step1;

interface Greet {
	void greet();
}

interface Bye {
	void bye();
}

class Morning implements Greet, Bye {

	public void bye() {
		System.out.println("����");
	}

	public void greet() {
		System.out.println("�ȳ�");
	}

}

public class Meet {
	public static void main(String[] args) {
		Morning morning = new Morning();
		morning.greet();
		morning.bye();
	}

}
