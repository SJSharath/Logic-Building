package First30Logics;

public class AreaOfRectangle {
	public int Area(int length,int breadth) {
		return (length)*(breadth);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfRectangle obj = new AreaOfRectangle();
		int result = obj.Area(20, 30);
		System.out.println(result);
	}

}
