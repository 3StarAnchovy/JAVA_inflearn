package step1;

class Book {
	String title;
	int price;
	int num;

	Book() {
		title = "자바 클래스 기초";
		price = 10000;
	}
	
	Book(String title , int price)
	{
		this.title=title;
		this.price=price;
	}
	
	void print()
	{
		System.out.println("제   목" + title);
		System.out.println("가   격" + price);
		System.out.println("주문수량" + num);
		System.out.println("합계 금액" + price*num);
	}
}

public class MyBook {
	public static void main(String[] args) {
		Book book = new Book("자바 디자인 패턴",20000);
		book.num=5;
		book.print();
	}

}
