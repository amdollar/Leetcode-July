package io.test.Week3;

public class Power {

	public static void main(String[] args) {
		double num = 2.00000;
		int power = -2;
		double res = myPow(num, power);
		System.out.println(res);

	}

	public static double myPow(double x, int n) {
		if (n < 0) {
			return pow(1.0 / x, -n);
		}
		return pow(x, n);
	}

	public static double pow(double x, int n) {
		if (n == 0) {
			return 1.0;
		}
		if (n % 2 == 0) {
			return pow(x * x, n / 2);
		} else {
			return pow(x * x, n / 2) * x;
		}

	}
}
