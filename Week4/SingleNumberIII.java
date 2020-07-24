package io.test.Week4;

public class SingleNumberIII {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 1, 3, 2, 5 };
		int[] res = singleNumber(arr);
		for (int i : res) {
			System.out.println(i);
		}
	}

	public static int[] singleNumber(int[] nums) {
		int diff = 0;
		for (int num : nums) {
			diff ^= num;
		}
		diff &= -diff;

		// Pass 2 :
		int[] rets = { 0, 0 }; // this array stores the two numbers we will return
		for (int num : nums) {
			if ((num & diff) == 0) // the bit is not set
			{
				rets[0] ^= num;
			} else // the bit is set
			{
				rets[1] ^= num;
			}
		}
		return rets;

	}
}
