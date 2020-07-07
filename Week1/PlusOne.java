package io.test.Week1;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = new int[] { 1, 9, 9 };
		printArr(digits);
		System.out.println(" ");
		int[] res = plusOne(digits);

		printArr(res);

	}

	private static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i] = digits[i] + 1;
				return digits;
			}
			digits[i] = 0;
		}
		int[] res = new int[digits.length + 1];
		res[0] = 1;
		return res;
	}

	private static void printArr(int[] digits) {
		for (int i : digits)
			System.out.print(i + " ");
	}

}
