package First30Logics;

public class IsPositiveOrNegative {
	public void PosNeg(int a) {
		if(a>0) {
			System.out.println("Positive");
		}else {
			System.out.println("Negitive");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPositiveOrNegative obj = new IsPositiveOrNegative();
		obj.PosNeg(-111);
		}

}
