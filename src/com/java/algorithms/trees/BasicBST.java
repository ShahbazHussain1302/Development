package com.java.algorithms.trees;

import com.java.utility.TreeNodeG;

public class BasicBST {

	public TreeNodeG<Integer> root;

	public BasicBST()
	{
		root = null;
	}

	public void insert(int data)
	{
		root = insert(root, data);
	}

	public TreeNodeG insert(TreeNodeG<Integer> node, int data)
	{
		if(node == null)
		{
			node = new TreeNodeG<Integer>(data);
		}
		if(node.getData() < data)
		{	
			node.setRight(insert(node.getRight(), data));
		}
		else if(node.getData() > data)
		{
			node.setLeft(insert(node.getLeft(), data));
		}
		return node;
	}

	public boolean find(int data)
	{
		return find(root, data);
	}

	public boolean find(TreeNodeG<Integer> node, int data)
	{
		if(node == null)
			return false;
		if(node.getData()<data)
		{
			return find(node.getRight(), data);
		}
		if(node.getData()>data)
		{
			return find(node.getLeft(), data);
		}
		if(node.getData() == data)
			return true;
		return false;
	}

	public boolean delete(int data)
	{
		return delete(root, data);
	}

	@SuppressWarnings("unchecked")
	public boolean delete(TreeNodeG<Integer> node, int data)
	{
		TreeNodeG<Integer> parent = node;
		TreeNodeG<Integer> current = node;
		boolean isLeft = false;
		boolean foundNode = false;

		while(current.getData() != data)
		{
			parent = current;
			if(current.getData()<data)
			{
				current = current.getRight();
				isLeft = false;
			}
			if(current.getData()>data)
			{
				current = current.getLeft();
				isLeft = true;
			}
		}
		if(current.getData() == data)
			foundNode = true;

		if(foundNode)
		{
			if(current.getLeft() == null && current.getRight() == null)
			{
				if(current == root)
				{
					root = null;
				}
				if(isLeft)
				{
					parent.setLeft(null);
				}
				else
				{
					parent.setRight(null);
				}
			}		
			else if(current.getLeft() != null && current.getRight() == null)
			{
				if(current == root)
				{
					root = current.getLeft();
				}
				if(isLeft)
				{
					parent.setLeft(current.getLeft());
				}
				else
				{
					parent.setRight(current.getLeft());
				}
			}
			else if(current.getLeft() == null && current.getRight() != null)
			{
				if(current == root)
				{
					root = current.getRight();
				}
				if(isLeft)
				{
					parent.setLeft(current.getRight());
				}
				else
				{
					parent.setRight(current.getRight());
				}
			}
			else if(current.getLeft() != null && current.getRight() != null)
			{
				TreeNodeG<Integer> successor = getSuccessor(current.getRight());

				successor.setLeft(current.getLeft());

				if(isLeft)
				{
					parent.setLeft(successor);
				}
				else
				{
					parent.setRight(successor);
				}
			}
		}

		return foundNode;
	}

	public TreeNodeG<Integer> getSuccessor(TreeNodeG<Integer> node)
	{
		TreeNodeG<Integer> successor = node;
		TreeNodeG<Integer> parentSuccessor = node;

		while(successor.getLeft() != null)
		{
			parentSuccessor = successor;
			successor = successor.getLeft();
		}

		if(successor.getRight() != null)
		{
			parentSuccessor.setLeft(successor.getRight());
		}

		successor.setRight(node);


		return successor;
	}

	public int height(TreeNodeG<Integer> node)
	{
		if(node != null)
		{
			int left = 1 + height(node.getLeft());
			int right = 1 + height(node.getRight());
			return left>=right?left:right;
		}
		return 0;		
	}

	public void preOrder(TreeNodeG<Integer> node)
	{
		if(node != null)
		{
			System.out.print(" "+ node.getData()+" ");
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}

	public void inOrder(TreeNodeG<Integer> node)
	{
		if(node != null)
		{
			inOrder(node.getLeft());
			System.out.print(" "+ node.getData()+" ");
			inOrder(node.getRight());
		}
	}

	public void postOrder(TreeNodeG<Integer> node)
	{
		if(node != null)
		{
			postOrder(node.getLeft());
			postOrder(node.getRight());
			System.out.print(" "+ node.getData()+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicBST tree = new BasicBST();
		int[] arr = {8,3,5,4,1,2,7,9};
		for(int a: arr)
		{
			tree.insert(a);
		}
		System.out.println("InOrder Traversal");
		tree.inOrder(tree.root);
		System.out.println("\nPreOrder Traversal");
		tree.preOrder(tree.root);
		System.out.println("\nPostOrder Traversal");
		tree.postOrder(tree.root);
		System.out.println("\nHeight of given Tree is :" + tree.height(tree.root));
		System.out.println("\nFind : "+tree.find(9));
		tree.delete(8);
		System.out.println("\nInOrder Traversal");
		tree.inOrder(tree.root);
		
	}

}
