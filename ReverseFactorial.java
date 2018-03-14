public class ReverseFactorial {

	public static void main(String[] args) {
		reverseFactorial(479001600);
	}

	public static String reverseFactorial(int input) {
		double inputDouble = input;
		int divisor = 1;
		int counter = 0;
		while (inputDouble > 1) {
			inputDouble /= divisor;
			divisor++;
			counter++;
			if (inputDouble % 1 != 0) {
				System.out.println(input + " NONE");
				return "NONE";
			}
		}
		System.out.println(input + " " + counter + "!");
		return "PASSED";
	}
}
