package io.test.Week4;
/**
*
*
*https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/547/week-4-july-22nd-july-28th/3401/
*/
import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourcetoTarget {

	public static void main(String[] args) {
		int[][] grap = new int[][] { { 1, 2 }, { 3 }, { 3 }, {} };
	}

	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> path = new ArrayList<>();

		path.add(0);
		dfsSearch(graph, 0, res, path);

		return res;
	}

	private void dfsSearch(int[][] graph, int node, List<List<Integer>> res, List<Integer> path) {
		if (node == graph.length - 1) {
			res.add(new ArrayList<Integer>(path));
			return;
		}

		for (int nextNode : graph[node]) {
			path.add(nextNode);
			dfsSearch(graph, nextNode, res, path);
			path.remove(path.size() - 1);
		}
	}
}
