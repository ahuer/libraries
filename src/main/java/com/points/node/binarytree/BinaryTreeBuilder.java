package com.points.node.binarytree;

import java.util.List;

import com.points.tree.Node;
import com.points.tree.TreeBuilder;

public class BinaryTreeBuilder<T extends Comparable> implements TreeBuilder {
	@Override
	public Node<T> buildTree(List nodeValues) {
		
		if (nodeValues == null || nodeValues.isEmpty() ) {
			return null;
		}
		
		Node<T> rootNode = new Node(nodeValues.get(0));
		for (int i = 1; i < nodeValues.size(); i++ ) {
			addToTree(rootNode, nodeValues.get(i));
		}

		return rootNode;
	}

	private static <T> void addToTree(Node<T> rootNode, T value) {
		if (rootNode == null || value == null ) {
			return;
		}
		
		Node<T> currentNode = rootNode;
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
