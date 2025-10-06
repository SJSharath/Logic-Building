package First30Logics;

public class FahrenheitToCelsius {
	public void FtoC(double f) {
		f = (f-32)/1.8;
		System.out.println(f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FahrenheitToCelsius obj = new FahrenheitToCelsius();
		obj.FtoC(94);
	}

}
