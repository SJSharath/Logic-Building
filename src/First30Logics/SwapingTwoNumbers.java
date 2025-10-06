package First30Logics;

public class SwapingTwoNumbers {
	public void Swaping(int a, int b) {
		
		
		a = a-b;
		
		// a = 6
		//b=27
		
		b = b+a;
		
		//a = 6
		//b=33
		
		a = b-a;
		
		//b=33
		//a=27
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapingTwoNumbers obj = new SwapingTwoNumbers();
		obj.Swaping(33,27);
		//System.out.println(result);
		}
}
