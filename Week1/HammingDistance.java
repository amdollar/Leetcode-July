package io.test.Week1;

public class HammingDistance {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 4;
		int hammingDistance = hammingDistance(num1, num2);
		System.out.println(hammingDistance);
	}

	private static int hammingDistance(int x, int y) {
		int res = 0;

		while (x > 0 || y > 0) {
			res += (x % 2) ^ (y % 2);
			x = x >> 1;
			y = y >> 1;
		}
		return res;

	}

}
