package First30Logics;

public class IsDivisibleBy5 {
	public void Division(int a){
		if( a%5==0) {
			System.out.println("Divisible By 5");
		}else {
			System.out.println("Is not Divisible by 5");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsDivisibleBy5 obj = new IsDivisibleBy5();
		obj.Division(42);
	}

}
