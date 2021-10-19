package com.bridelabz.demo;

public class LinkedList<K> {
	private K key;
	private LinkedList next;

	public LinkedList(K key) {
		this.key = key;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public LinkedList getNext() {
		return next;
	}

	public void setNext(LinkedList next) {
		this.next = next;
	}

}