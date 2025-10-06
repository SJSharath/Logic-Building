package First30Logics;

public class CelsiusToFahrenheit {
	public void CtoF(double c) {
		c = (c*1.8)+32;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CelsiusToFahrenheit obj = new CelsiusToFahrenheit();
		obj.CtoF(0);
	}

}
