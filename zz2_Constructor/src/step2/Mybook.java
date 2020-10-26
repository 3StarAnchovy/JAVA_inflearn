package step2;

class Book {
	String title;
	int price;

	Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	// ����������
	Book(Book copy) {
		title = copy.title;
		price = copy.price;
	}

	void print() {
		System.out.println("��     �� : " + title);
		System.out.println("��     �� : " + price);
	}
}

public class Mybook {

	public static void main(String[] args) {
		Book book1 = new Book("�ڹ� Ŭ���� ����", 10000);
		book1.print();

		Book book2 = new Book(book1);
		book2.title = "�ڹ� ������ ����";
		book2.print();
	}

}