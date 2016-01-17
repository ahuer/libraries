package com.points.node.binarytree;

import java.util.List;

import com.points.node.twochild.Node;

public class BinaryTreeBuilder {

	public static <T extends Comparable<T>> Node<T> setUpTree(List<T> nodeValues) {
		if (nodeValues == null) {
			return null;
		}

		Node<T> firstNode = null;
		for (T value : nodeValues) {
			if (firstNode == null) {
				firstNode = new Node<>(value);
				continue;
			}
			addToTree(firstNode, value);
		}

		return firstNode;
	}

	private static <T extends Comparable<T>> void addToTree(Node<T> firstNode, T value) {
		if (firstNode == null || value == null ) {
			return;
		}
		
		Node<T> currentNode = firstNode;
		Node<T> child = currentNode;
		boolean isLeftChild = false;

		while (child != null) {
			isLeftChild = false;
			
			if (value.compareTo(currentNode.getData()) < 0) {
				child = currentNode.getLeftChild();
				isLeftChild = true;
			} else {
				child = currentNode.getRightChild();
			}

			if (child != null) {
				currentNode = child;
			}
		}
		
		child = new Node<>(value);
		if (isLeftChild) {
			currentNode.setLeftChild(child);
		} else {
			currentNode.setRightChild(child);
		}
	}

}
