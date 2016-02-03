package com.points.tree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node<T extends Comparable> {
	
	private T data;
	private Map<Integer, Node<T>> children;
	
	@SuppressWarnings("unused")
	public Node() {}
	
	public Node(T data) {
		this.data = data;
		children = new HashMap<>();		
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public Map<Integer, Node<T>> getChildren() {
		return children;
	}
	
	public void setChildren(Map<Integer, Node<T>> children) {
		this.children = children;
	}
	
	public Node<T> getChild(int key) {
		return children.get(key);
	}
	
	public void setChild(Node<T> value, int key) {
		children.put(key, value);
	}

}
