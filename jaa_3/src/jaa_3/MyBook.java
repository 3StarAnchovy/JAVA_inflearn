package jaa_3;
//�ʵ常 �ִ� Ŭ������ ���

class Book {
	String title;
	String author;
	int price;
}

public class MyBook {

	public static void main(String[] args) {
		// ��ü ����
		Book book = new Book();

		// �ʵ� ����
		book.title = "Ŭ������ ����";
		book.author = " ȫ�浿";
		book.price = 10000;
		System.out.println(book.title + ":" + book.author + ":" + book.price);
	}

}