package com.points.tree;

import java.util.ArrayList;
import java.util.List;

public class Node<T extends Comparable> {
	
	private T data;
	private List<Node<T>> children;
	
	@SuppressWarnings("unused")
	public Node() {}
	
	public Node(T data) {
		this.data = data;
		children = new ArrayList<>();		
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public List<Node<T>> getChildren() {
		return children;
	}
	
	public void setChildren(List<Node<T>> children) {
		this.children = children;
	}
	
	public Node<T> getChild(int index) {
		return children.get(index);
	}
	
	public void setChild(Node<T> value, int index) {
		children.set(index, value);
	}

	public int compareTo(Node<T> o) {
		return this.getData().compareTo(o.getData());
	}

}
