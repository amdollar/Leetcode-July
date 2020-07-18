package io.test.Week3;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopK {

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		int[] res = topKFrequent(nums, k);
		for (int i : res)
			System.out.println(i);
	}

	public static int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> counterMap = new HashMap<>();
		for (int num : nums) {
			int count = counterMap.getOrDefault(num, 0);
			counterMap.put(num, count + 1);
		}

		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
		for (Map.Entry<Integer, Integer> entry : counterMap.entrySet()) {
			pq.offer(entry);
			if (pq.size() > k)
				pq.poll();
		}

		int[] res = new int[k];
		int count = 0;
		while (!pq.isEmpty()) {
			// res.add(0, pq.poll().getKey());
			res[count] = pq.poll().getValue();
			count++;
		}
		return res;
	}
}
