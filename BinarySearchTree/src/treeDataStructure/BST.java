package treeDataStructure;

import DataAccess.Laptop;

public class BST {
	private TreeNode rootNode;
	public BST() {
		rootNode=null;	
	}
	
	public TreeNode addNode(TreeNode node, Laptop data,Boolean byModel) {
		if(node==null) {
			node=new TreeNode(data);
		}else if(byModel?node.getData().getModel().compareTo(data.getModel())>0: node.getData().getPrice()>data.getPrice()) {
			node.setLeft(addNode(node.getLeft(), data,byModel));
		}else {
			node.setRight(addNode(node.getRight(), data,byModel));
		}
		return node;
	}
	
	public void printInorder(TreeNode node) {
		if(node!=null) {
			printInorder(node.getLeft());
			System.out.println("Price:"+node.getData().getPrice()+" Model: "+node.getData().getModel());
			printInorder(node.getRight());
		}
	}

	public TreeNode getRootNode() {
		return rootNode;
	}

	public void setRootNode(TreeNode rootNode) {
		this.rootNode = rootNode;
	}
	
	
	
}

