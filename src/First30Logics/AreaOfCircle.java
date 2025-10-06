package First30Logics;

public class AreaOfCircle {
	public void CArea(double r) {
		r = (3.14)*(r*r);
		System.out.println(r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfCircle obj = new AreaOfCircle();
		obj.CArea(420);
	}

}
