package com.DSA.Trees;

public class Traverse {
	public static void inOrder(TreeNode root) {
		//rescursion
		//base condition
		if(root ==null) {
			return;
		}
		
		inOrder(root.left);
		System.out.println(root.val+"->");
		inOrder(root.right);
	}
	
	public static void preOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		//root -> left-> right
		
		System.out.println(root.val+"->");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void postOrder(TreeNode root) {
		//base condition
		if(root ==null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.val+"->");
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		
		root.left = new TreeNode(4);
		root.right = new TreeNode(6);
		
		root.left.left = new TreeNode(7);
		root.left.right = new TreeNode(9);
		
		root.right.left = new TreeNode(5);
		
		root.right.left.left = new TreeNode(3);
		root.right.left.right = new TreeNode(1);
		System.out.println("=====================inOreder traversal==============================");
		inOrder(root);
		System.out.println("=====================postOrder traversal==============================");
		postOrder(root);
		
	}
	
}
