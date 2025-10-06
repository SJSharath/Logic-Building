package First30Logics;

public class IsDivisibleBy2And3 {
	public void Division23(int a) {
		if(a%2==0&&a%3==0) {
			System.out.println("Is Divisible By Both");
		}else if(a%2==0&&a%3!=0) {
			System.out.println("Only Divisible by 2");
		}else if(a%2!=0&&a%3==0){
			System.out.println("Only Divisible by 3");
		}else {
			System.out.println("Divisible by none");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsDivisibleBy2And3 obj = new IsDivisibleBy2And3();
		obj.Division23(293);
	}

}
