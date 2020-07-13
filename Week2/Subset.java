package io.test.Week2;

import java.util.ArrayList;
import java.util.List;

public class Subset {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3 };

		List<List<Integer>> result = subsets(arr);
		for (List<Integer> temp : result) {
			for (Integer i : temp) {
				System.out.print(i + " ");
			}
		}

	}

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<>());

		for (int n : nums) {
			int size = result.size();
			for (int i = 0; i < size; i++) {
				List<Integer> subset = new ArrayList<>(result.get(i));
				subset.add(n);
				result.add(subset);
			}
		}
		return result;

	}
}
