package First30Logics;

public class LargestOfTwoNumbers {
	public void LargestAB(int a, int b) {
		if(a>b) {
			System.out.println("A is Largest");
		}else {
			System.out.println("B is Largest");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestOfTwoNumbers obj = new LargestOfTwoNumbers();
		obj.LargestAB(10, 100);
	}

}
