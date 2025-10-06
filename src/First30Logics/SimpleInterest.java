package First30Logics;

public class SimpleInterest {
	//ptr/100
	public void interest(double p,double t, double r) {
//		t = t*12;
//		r = (r/100)*p;
		System.out.println(((p*t*r)/100)+p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest obj = new SimpleInterest();
		obj.interest(1000, 2, 5);
	}

}
