package step2;

class Book {
	String title;
	int price;

	Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	// 복제생성자
	Book(Book copy) {
		title = copy.title;
		price = copy.price;
	}

	void print() {
		System.out.println("제     목 : " + title);
		System.out.println("가     격 : " + price);
	}
}

public class Mybook {

	public static void main(String[] args) {
		Book book1 = new Book("자바 클래스 기초", 10000);
		book1.print();

		Book book2 = new Book(book1);
		book2.title = "자바 디자인 패턴";
		book2.print();
	}

}
