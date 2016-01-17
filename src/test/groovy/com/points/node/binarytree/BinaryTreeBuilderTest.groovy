package com.points.node.binarytree

import static org.junit.Assert.*
import org.junit.Test

import com.points.node.binarytree.BinaryTreeBuilder

class BinaryTreeBuilderTest {

	@Test
	public void testBuilderShortList() {
		def list = [3, 4, 2]
		def tree = BinaryTreeBuilder.setUpTree(list)
		assertEquals(3, tree.getData())
		assertEquals(2, tree.getLeftChild().getData())
		assertEquals(4, tree.getRightChild().getData())
		assertEquals(null, tree.getLeftChild().getLeftChild())
	}
}