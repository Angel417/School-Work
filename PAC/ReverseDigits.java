public class ReverseDigits {
	public static void main(String[] args) {
		int a = 1234;

		int firstDigit = 1234 % 10;
		int secondDigit = 1234 % 100;
		int secondDigit2 = secondDigit / 10;
		int thirdDigit = 1234 % 1000;
		int thirdDigit2 = thirdDigit / 100;
		int fourthDigit = 1234 / 1000;

		int b = (firstDigit * 1000) + (secondDigit2 * 100) + (thirdDigit2 * 10) + fourthDigit;

		System.out.println("The reverse of '1234' is " + b);


	}
}