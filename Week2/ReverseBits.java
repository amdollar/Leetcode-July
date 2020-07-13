package io.test.Week2;

public class ReverseBits {

	public static void main(String[] args) {
		int i = 43261596;
		int res = resverseBits(i);
		System.out.println(res);
	}

	private static int resverseBits(int n) {
		int res = 0;
		for (int i = 0; i < 32; i++) {
			res = res << 1;
			if ((n & 1) >= 1)
				res++;
			n = n >> 1;
		}
		return res;
	}

}
