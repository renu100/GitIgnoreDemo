package com.bridelabz.demo;

import org.junit.Test;

public class LinkedListTest {
	@Test
	public void testLink() {
		LinkedList<Integer>myFirstNode = new LinkedList<>(56);
		LinkedList<Integer>mySecondNode = new LinkedList<>(30);
		LinkedList<Integer>myThirdNode = new LinkedList<>(70);
		
		myFirstNode.setNext(mySecondNode);
		mySecondNode.getNext();

	}
}
