package io.test.Week4;

public class FindMin {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 5, 6, 7, 0, 1, 2 };
		int res = findMin(arr);
	}

	public static int findMin(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		int min = Integer.MAX_VALUE;
		while (low <= high) {
			int mid = (low + high) / 2;
			min = Math.min(min, nums[mid]);
			if (nums[low] < nums[mid] || nums[mid] > nums[high]) {
				min = Math.min(min, nums[low]);
				low = mid + 1;
			} else if (nums[low] > nums[mid] || nums[mid] < nums[high]) {
				high = mid - 1;
			} else {
				low++;
			}
		}
		return min;

	}
}
