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
		return createTreeFromList(nodeValues);
	}

	private <T extends Comparable> BinaryTreeNode<T> createTreeFromList(List<T> nodeValues) {
		if (nodeValues == null || nodeValues.isEmpty() ) {
			return null;
		}
		
		if (nodeValues.size() == 1 ) {
			return new BinaryTreeNode<>(nodeValues.get(0));
		}
		
		int middle = nodeValues.size() / 2;
		BinaryTreeNode<T> rootNode = new BinaryTreeNode<>(nodeValues.get(middle));
		
		rootNode.setLeftChild(createTreeFromList(nodeValues.subList(0, middle)));
		rootNode.setRightChild(createTreeFromList(nodeValues.subList(middle + 1, nodeValues.size())));
		
		return rootNode;
	}

	

}
