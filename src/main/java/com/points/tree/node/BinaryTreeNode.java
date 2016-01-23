package com.points.tree.node;

import com.points.tree.Node;

public class BinaryTreeNode<T> extends Node {
	
	@SuppressWarnings("unused")
	private BinaryTreeNode() {}
	
	public BinaryTreeNode(T data) {
		super(data, 2);
	}
	
	public BinaryTreeNode<T> getLeftChild() {
		return (BinaryTreeNode<T>) getChild(0);
	}

	public void setLeftChild(BinaryTreeNode<T> leftChild) {
		setChild(leftChild, 0);
	}

	public BinaryTreeNode<T> getRightChild() {
		return (BinaryTreeNode<T>) getChild(1);
	}

	public void setRightChild(BinaryTreeNode<T> rightChild) {
		setChild(rightChild, 1);
	}
		
}
