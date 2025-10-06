package First30Logics;

public class ReminderOfTwoNumbers {
	public int Reminder(int a, int b) {
		return a%b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReminderOfTwoNumbers obj = new ReminderOfTwoNumbers();
		int result = obj.Reminder(50, 100);
		System.out.println(result);
		}

}
