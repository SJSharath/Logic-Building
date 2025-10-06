package First30Logics;

public class IsEvenOrOdd {
 	public void EvenOrOdd(int a) {
		if(a%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsEvenOrOdd obj = new IsEvenOrOdd();
		obj.EvenOrOdd(28);
		}

}
