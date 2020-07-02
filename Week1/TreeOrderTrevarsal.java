package io.test.Week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeOrderTrevarsal {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		List<List<Integer>> res = levelOrderBottom(root);
		for (List<Integer> resd : res) {
			System.out.println("");
			for (Integer d : resd)
				System.out.print(d);
		}

	}

	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>(); // 3
		// 9 20
		// 15 7

		if (root == null)
			return res;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> node = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode curr = queue.remove();
				node.add(curr.val);
				if (curr.left != null) {
					queue.add(curr.left);
				}
				if (curr.right != null) {
					queue.add(curr.right);
				}
			}
			res.add(node);
		}
		Collections.reverse(res);
		return res;

	}

}