package com.points.tree.binarytree;

import java.util.ArrayList;
import java.util.List;

import com.points.tree.Node;

public class BinaryTreeNode<T extends Comparable> extends Node {
	
	@SuppressWarnings("unused")
	private BinaryTreeNode() {}
	
	public BinaryTreeNode(T data) {
		super(data);
	}
	
	public Node<T> getLeftChild() {
		return getChild(1);
	}

	public void setLeftChild(Node<T> leftChild) {
		setChild(leftChild, 1);
	}

	public Node<T> getRightChild() {
		return getChild(2);
	}

	public void setRightChild(Node<T> rightChild) {
		setChild(rightChild, 2);
	}
		
}
