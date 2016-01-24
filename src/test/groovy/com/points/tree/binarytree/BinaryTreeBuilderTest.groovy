package com.points.tree.binarytree

import static org.junit.Assert.*

import org.junit.Test

class BinaryTreeBuilderTest {

	@Test
	public void testBuilderShortList() {
		def list = [3, 4, 2]
		def builder = new BinaryTreeBuilder<Comparable>()
		def tree = (BinaryTreeNode) builder.buildTree(list)
		assertEquals(3, tree.getData())
		assertEquals(2, tree.getLeftChild().getData())
		assertEquals(4, tree.getRightChild().getData())
		assertEquals(null, tree.getLeftChild().getLeftChild())
	}
}