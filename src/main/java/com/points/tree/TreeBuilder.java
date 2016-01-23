package com.points.tree;

import java.util.List;

public interface TreeBuilder<T extends Comparable> {
	
	Node<T> buildTree(List<T> nodeValues);

}
