package step3;

class Book
{
	String tiltle; 
}

public class HeapUse {

	public static void main(String[] args) {
		Book book1 = new Book(); //heap에 저장 
		book1.tiltle = "자바 클래스 기초";
		Book book2 = book1; // 똑같은 객체 참조
		
		System.out.println("book1.tilte : " + book1.tiltle);
		System.out.println("book2.tilte : " + book2.tiltle);
		System.out.println("-------------------------------");
		
		book2.tiltle = "자바 디자인 패턴";
		
		System.out.println("book1.tiltle : " + book1.tiltle);
		System.out.println("book2.tiltle : " + book2.tiltle);
		
	}

}
