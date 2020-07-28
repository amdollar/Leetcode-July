package io.test.Week4;

import java.util.HashMap;

public class ConstructBinaryTree {

	public static void main(String[] args) {

		int[] inorder = new int[] { 9, 3, 15, 20, 7 };
		int[] postorder = new int[] { 9, 15, 7, 20, 3 };
		TreeNode res = buildTree(inorder, postorder);
		inorder(res);
	}

	private static void inorder(TreeNode root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.println(root.val);
		inorder(root.right);
	}

	public static TreeNode buildTree(int[] inorder, int[] postorder) {
		if (inorder == null || postorder == null || inorder.length != postorder.length)
			return null;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < inorder.length; ++i)
			hm.put(inorder[i], i);
		return buildTreePostIn(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, hm);
	}

	private static TreeNode buildTreePostIn(int[] inorder, int is, int ie, int[] postorder, int ps, int pe,
			HashMap<Integer, Integer> hm) {
		if (ps > pe || is > ie)
			return null;
		TreeNode root = new TreeNode(postorder[pe]);
		int ri = hm.get(postorder[pe]);
		TreeNode leftchild = buildTreePostIn(inorder, is, ri - 1, postorder, ps, ps + ri - is - 1, hm);
		TreeNode rightchild = buildTreePostIn(inorder, ri + 1, ie, postorder, ps + ri - is, pe - 1, hm);
		root.left = leftchild;
		root.right = rightchild;
		return root;
	}

}
