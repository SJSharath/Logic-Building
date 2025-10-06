package First30Logics;

public class ProductOfTwoNumbers {
	public int Product(int a, int b) {
		return a*b;
	}
	public static void main(String[]args) {
		ProductOfTwoNumbers obj = new ProductOfTwoNumbers();
		int result = obj.Product(5000, 10000);
		System.out.println(result);
	}

}
