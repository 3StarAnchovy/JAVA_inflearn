package step1;

public class StepUse {

	public static void main(String[] args) {
		int num=10;
		int num2=20;
		adder(num,num2);
		System.out.println("----------------------");
	}

	public static int adder(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
}
