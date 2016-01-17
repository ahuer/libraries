package com.points.node.twochild;


public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
	private T data;
	private Node<T> leftChild;
	private Node<T> rightChild;
	
	@SuppressWarnings("unused")
	private Node() {}
	
	public Node(T data) {
		this.data = data;
		leftChild = null;
		rightChild = null;
	}
	
	public T getData() {
		return data;
	}

	public Node<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node<T> leftChild) {
		this.leftChild = leftChild;
	}

	public Node<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}
	
	@Override
	public int compareTo(Node<T> other) {
		return this.data.compareTo(other.getData());
	}
		
}
