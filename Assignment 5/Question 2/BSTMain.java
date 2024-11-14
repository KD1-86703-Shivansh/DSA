package com.sunbeam;

public class BSTMain {

	public static void main(String[] args) {

		BST tree = new BST();
		
		tree.addNode(8);
		tree.addNode(3);
		tree.addNode(10);
		tree.addNode(2);
		tree.addNode(6);
		tree.addNode(4);
		tree.addNode(7);
		tree.addNode(15);
		tree.addNode(14);
		tree.addNode(9);
		
		tree.deleteNode(7);

		
		BST.Node n=tree.recursionSearch(15);
		if(n!=null)
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}

}
