package com.points.tree.binarytree

import static org.junit.Assert.*

import org.junit.Test

class BinaryTreeBuilderTest {

	@Test
	public void testBuilderShortList() {
		def list = [2, 4, 3]
		def builder = new BinaryTreeBuilder<Comparable>()
		def root = (BinaryTreeNode) builder.buildTree(list)
		assertEquals(3, root.getData())
		assertEquals(2, root.getLeftChild().getData())
		assertEquals(4, root.getRightChild().getData())
		assertEquals(null, root.getLeftChild().getLeftChild())
	}
	
	@Test
	public void testBuilderListOfTwo() {
		def list = [2, 4]
		def builder = new BinaryTreeBuilder<Comparable>()
		def root = (BinaryTreeNode) builder.buildTree(list)
		assertEquals(4, root.getData())
		assertEquals(2, root.getLeftChild().getData())
	}
}