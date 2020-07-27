package io.test.Week4;

public class AddDigits {

	public static void main(String[] args) {
		int num = 10;
		int res = addDigits(num);
		System.out.println(res);
	}

	public static int addDigits(int num) {
		int res = 0;
		while (num > 9) {
			res += num % 10;
			int temp = num / 10;
			res += temp;
			num = res;
			res = 0;
		}
		return num;
	}
}
