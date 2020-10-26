import team1.Circle;
public class B_importCircle {
	public static void main(String[] args)
	{
		Circle c1 = new team1.Circle();
		c1.setRad(3.5);
		System.out.println("반지름 3.5의 원 넓이 " + c1.getArea());
		
	}
}
