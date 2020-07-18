package io.test.Week2;

public class SameTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.leftNode = new TreeNode(null);
//		root.leftNode.rightNode = new TreeNode(3);
//		root.leftNode.leftNode = new TreeNode(5);
		root.rightNode = new TreeNode(3);
//		root.rightNode.rightNode = new TreeNode(9);

		TreeNode root2 = new TreeNode(1);
//		root2.leftNode = new TreeNode(2);
//		root2.leftNode.rightNode = new TreeNode(3);
//		root2.leftNode.leftNode = new TreeNode(5);
		root2.rightNode = new TreeNode(2);
//		root2.rightNode.rightNode = new TreeNode(9);

		System.out.println(sameTrees(root, root2));
	}

	
	private static boolean sameTrees(TreeNode root, TreeNode root2) {
		
		if (root == null && root2 == null)
			return true;
		else if (root == null || root2 == null)
			return false;
		else if (root.data != root2.data)
			return false;
		else
			return sameTrees(root.leftNode, root2.leftNode) && sameTrees(root.rightNode, root2.rightNode);
	}

}
