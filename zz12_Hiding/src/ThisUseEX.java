class SimpleBox {
	private int num;
	SimpleBox(int num)
	{
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
public class ThisUseEX {

	public static void main(String[] args) {
		SimpleBox sb = new SimpleBox(5);
		sb.setNum(10);
		System.out.println(sb.getNum());
		
	}

}
