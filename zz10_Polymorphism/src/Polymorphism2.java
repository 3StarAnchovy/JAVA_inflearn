
interface Printable {
	void print(String doc);
}

class PrnDrvSamsung implements Printable {

	@Override
	public void print(String doc) {
		System.out.println(doc + "\nFrom Samsung : BW ver");
	}

}

class PrnDrvEpson implements Printable {

	@Override
	public void print(String doc) {
		System.out.println(doc + "\nFrom Epson : BW ver");
	}
}

public class Polymorphism2 {

	public static void main(String[] args) {
		String doc = "프린터로 출력을 합니다.";
		
		Printable prn1 = new PrnDrvSamsung();
		prn1.print(doc);
		
		Printable prn2 = new PrnDrvEpson();
		prn2.print(doc);
	}

}
