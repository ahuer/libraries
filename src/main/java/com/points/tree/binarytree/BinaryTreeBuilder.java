package com.points.tree.binarytree;

import java.util.Collections;
import java.util.List;

import com.points.tree.Node;
import com.points.tree.TreeBuilder;

public class BinaryTreeBuilder<T extends Comparable> implements TreeBuilder {
	
	@Override
	public BinaryTreeNode<T> buildTree(List nodeValues) {
		
		if (nodeValues == null || nodeValues.isEmpty() ) {
			return null;
		}
		
		Collections.sort(nodeValues);		
		int middle = nodeValues.size() / 2;
		BinaryTreeNode<T> rootNode = new BinaryTreeNode((T) nodeValues.get(middle));

		return addToTree(rootNode, nodeValues);
	}

	private <T extends Comparable> BinaryTreeNode<T> addToTree(BinaryTreeNode<T> rootNode, List<T> nodeValues) {
		if (rootNode == null || nodeValues == null || nodeValues.isEmpty() ) {
			return null;
		}
		
		if (nodeValues.size() == 1 ) {
			return rootNode;
		}
		// FIX LATER 
		
		BinaryTreeNode<T> currentNode = rootNode;
		BinaryTreeNode<T> child = currentNode;
		boolean isLeftChild = false;

		while (child != null) {
			isLeftChild = false;
			
			if (nodeValues.get(0).compareTo(currentNode.getData()) < 0) {
				child = currentNode.getLeftChild();
				isLeftChild = true;
			} else {
				child = currentNode.getRightChild();
			}

			if (child != null) {
				currentNode = child;
			}
		}
		
		child = new BinaryTreeNode<>(nodeValues.get(0));
		if (isLeftChild) {
			currentNode.setLeftChild(child);
		} else {
			currentNode.setRightChild(child);
		}
		
		return rootNode;
	}

	

}
