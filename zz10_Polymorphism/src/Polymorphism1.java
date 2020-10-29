abstract class Calc {
	int a = 5;
	int b = 6;

	abstract void plus();
}

class MyCalc extends Calc {
	@Override
	void plus() {
		System.out.println(a + b);
	}
	
	void minus()
	{
		System.out.println(a - b);
	}
}

public class Polymorphism1 {

	public static void main(String[] args) {
		MyCalc mycalc1 = new MyCalc();
		mycalc1.plus();
		mycalc1.minus();
		
		// ����Ŭ���� ��ü�� ���� Ŭ���� ��ü�� ����
		Calc myCalc2 = new MyCalc();
		myCalc2.plus();
		
		//���� �޼ҵ�� ���赵�� ����. ����� �� ����
		//myCalc2.minus();
	}

}
