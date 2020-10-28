package Step2;

interface Greet {
	void greet();
}

interface Bye extends Greet {
	void bye();
}

class Morning implements Bye {

	public void bye() {
		System.out.println("ºüºü");
	}

	public void greet() {
		System.out.println("¾È³ç");
	}

}

public class Meet {

	public static void main(String[] args) {
		Morning morning = new Morning();
		morning.greet();
		morning.bye();
	}

}
