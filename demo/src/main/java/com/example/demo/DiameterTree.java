package com.example.demo;
class TreeNode{
	TreeNode left;
	TreeNode right;
	Object value;
	
}

public class DiameterTree {
	public static void main(String[] args) {
		
	}
	public static int  findDiameter(TreeNode root) {
		if(root==null)
			return 0;
		int op1=findHeight(root.left)+findHeight(root.right);
		int op2=findDiameter(root.left);
		int op3=findDiameter(root.right);
		return Math.max(op1, Math.max(op2, op3));
	}
	public static int findHeight(TreeNode node) {
		if(node==null) {
			return 0;
		}
		int lh=findHeight(node.left);
		int rh=findHeight(node.right);
		return 1+Math.max(lh, rh);

	}
}
