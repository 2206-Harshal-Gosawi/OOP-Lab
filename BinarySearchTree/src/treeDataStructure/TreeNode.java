package treeDataStructure;

import DataAccess.Laptop;

public class TreeNode {
	private Laptop data;
	private TreeNode left,right;
	public TreeNode(Laptop data) {
		this.data=data;
		this.right=null;
		this.left=null;
	}
	
	public Laptop getData() {
		return data;
	}

	public void setData(Laptop data) {
		this.data = data;
	}

	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
}
