package io.test.Week5;
//https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/548/week-5-july-29th-july-31st/3407/
public class ClimbingStairs {

	public static void main(String[] args) {
		int stairs = 2;
		int res = climbStairs(stairs);
		System.out.println(res);
		;
	}

	public static int climbStairs(int n) {
		int[] res = new int[n + 1];
		res[0] = 1;// steps to climb 0 stairs
		res[1] = 1;// steps to climb 1 stairs
		for (int i = 2; i <= n; i++) {
			res[i] = res[i - 1] + res[i - 2];
		}

		return res[n];

	}
}
