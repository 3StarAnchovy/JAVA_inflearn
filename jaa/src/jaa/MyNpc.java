package jaa;

class NPC {
	// �ʵ� -������
	String name;
	int hp;

	// �޼ҵ� - ����
	void say() {
		System.out.println("�ȳ��ϼ���");
	}
}

public class MyNpc {
	public static void main(String args[]) {
		NPC aa = new NPC(); // �ν��Ͻ� ��ü������ �Ҵ�
		aa.name = "���";
		aa.hp = 100;
		System.out.println(aa.name + " : " + aa.hp);
		aa.say();
	}

}
