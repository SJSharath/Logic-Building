package First30Logics;

public class LargestOfThreeNumbers {
	public void LargestABC(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println("A is Largest");
		}else if(b>c && b>a) {
			System.out.println("B is Largest");
		}else {
			System.out.println("C is Largest");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestOfThreeNumbers obj = new LargestOfThreeNumbers();
		obj.LargestABC(10, 100, 20);
	}

}
