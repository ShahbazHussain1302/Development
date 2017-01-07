package com.java.utility;

public class TreeNodeG<T> {
	
	private T data;
	private TreeNodeG left, right;
	
	public TreeNodeG(T data)
	{
		this.data = data;
		left = null;
		right = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public TreeNodeG getLeft() {
		return left;
	}

	public void setLeft(TreeNodeG left) {
		this.left = left;
	}

	public TreeNodeG getRight() {
		return right;
	}

	public void setRight(TreeNodeG right) {
		this.right = right;
	}

}
