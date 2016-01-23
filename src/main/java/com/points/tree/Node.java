package com.points.tree;

public class Node<T extends Comparable> {
	
	private T data;
	private Node<T>[] children;
	
	@SuppressWarnings("unused")
	public Node() {}
	
	public Node(T data, int numChildren) {
		this.data = data;
		
		if (numChildren < 1 ) {
			throw new IllegalArgumentException("NumChildren must be more than 0");
		} 
		
		children = new Node[numChildren];		
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public Node<T>[] getChildren() {
		return children;
	}
	
	public void setChildren(Node<T>[] children) {
		this.children = children;
	}
	
	public Node<T> getChild(int index) {
		if (index < 0 || index > children.length - 1 ) {
			throw new IllegalArgumentException("Invalid index provided '" + index + "'");
		}
		
		return children[index];
	}
	
	public void setChild(Node<T> value, int index) {
		if (index < 0 || index > children.length - 1 ) {
			throw new IllegalArgumentException("Invalid index provided '" + index + "'");
		}
		
		children[index] = value;
	}

	public int compareTo(Node<T> o) {
		return this.getData().compareTo(o.getData());
	}
	
	public Node<T> evaluate() {
		return this;
	}

}
