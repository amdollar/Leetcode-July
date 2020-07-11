package io.test.Trees;

import java.util.ArrayList;
import java.util.List;

public class MaximumWidthofBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.leftNode = new TreeNode(3);
		root.leftNode.rightNode = new TreeNode(3);
		root.leftNode.leftNode = new TreeNode(5);
		root.rightNode = new TreeNode(2);
		root.rightNode.rightNode = new TreeNode(9);

		int maxWidth = maxWidth(root);
		System.out.println(maxWidth);
	}

	private static int maxWidth(TreeNode root) {
		return dfs(root, 0, 1, new ArrayList<Integer>(), new ArrayList<Integer>());
	}

	public static int dfs(TreeNode root, int level, int order, List<Integer> start, List<Integer> end) {
		if (root == null)
			return 0;
		if (start.size() == level) {
			start.add(order);
			end.add(order);
		} else
			end.set(level, order);
		int cur = end.get(level) - start.get(level) + 1;
		int left = dfs(root.leftNode, level + 1, 2 * order, start, end);
		int right = dfs(root.rightNode, level + 1, 2 * order + 1, start, end);
		return Math.max(cur, Math.max(left, right));
	}

}
