package io.test.Week5;
/*
 * Problem Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/548/week-5-july-29th-july-31st/3405/
 */
public class StockBuySellWithCooldown {

	public static void main(String[] args) {
		int prices[] = new int[] { 1, 2, 3, 0, 2 };
		int maxProfit = maxProfit(prices);
		System.out.println(maxProfit);
	}

	public static int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0)
			return 0;

		int n = prices.length;
		int[] M = new int[n];
		for (int i = 0; i < n; i++) {
			if (i == 0)
				M[0] = 0;
			else if (i == 1)
				M[1] = Math.max(prices[1] - prices[0], 0);
			else {
				M[i] = M[i - 1];
				// linear scan
				for (int j = 0; j < i; j++) {
					int prev = j >= 2 ? M[j - 2] : 0;
					M[i] = Math.max(M[i], prev + prices[i] - prices[j]);
				}
			}
		}

		return M[n - 1];
	}
}
