package Assignment3_2.Assignment3_2;

public class Arithmetic {
	
	private int x, y, sum;
	
	public Arithmetic(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public static int add(int a, int b) {
		return a+b;
	}
	public static void main(String[] args )
	{
		int result = add(4,3);
		System.out.println( "Sum = " + result);
	}
}