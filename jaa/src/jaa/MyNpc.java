package jaa;

class NPC {
	// 필드 -데이터
	String name;
	int hp;

	// 메소드 - 동작
	void say() {
		System.out.println("안녕하세요");
	}
}

public class MyNpc {
	public static void main(String args[]) {
		NPC aa = new NPC(); // 인스턴스 객체변수에 할당
		aa.name = "경비";
		aa.hp = 100;
		System.out.println(aa.name + " : " + aa.hp);
		aa.say();
	}

}
