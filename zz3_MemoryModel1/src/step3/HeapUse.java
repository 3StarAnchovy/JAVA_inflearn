package step3;

class Book
{
	String tiltle; 
}

public class HeapUse {

	public static void main(String[] args) {
		Book book1 = new Book(); //heap�� ���� 
		book1.tiltle = "�ڹ� Ŭ���� ����";
		Book book2 = book1; // �Ȱ��� ��ü ����
		
		System.out.println("book1.tilte : " + book1.tiltle);
		System.out.println("book2.tilte : " + book2.tiltle);
		System.out.println("-------------------------------");
		
		book2.tiltle = "�ڹ� ������ ����";
		
		System.out.println("book1.tiltle : " + book1.tiltle);
		System.out.println("book2.tiltle : " + book2.tiltle);
		
	}

}
