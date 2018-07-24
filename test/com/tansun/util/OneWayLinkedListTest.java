package com.tansun.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class OneWayLinkedListTest {
	
	public OneWayLinkedList<Integer> create() {
		OneWayLinkedList<Integer> a = new OneWayLinkedList<Integer>();
		return a;
	}

	@Test
	public void testAddT() {
		OneWayLinkedList<Integer> linked = create();
		linked.add(3);
		linked.add(4);
		linked.add(5);
		linked.add(6);
		linked.print();
	}

	@Test
	public void testAddTInt() {
		OneWayLinkedList<Integer> linked = create();
		linked.add(3);
		linked.add(4);
		linked.add(5);
		linked.add(6);
		linked.add(11,2);
		linked.print();
	}

	@Test
	public void testFind() {
		OneWayLinkedList<Integer> linked = create();
		linked.add(3);
		linked.add(4);
		linked.add(5);
		linked.add(6);
		System.out.println(linked.find(2));
	}

	@Test
	public void testFindIndex() {
		OneWayLinkedList<Integer> linked = create();
		linked.add(3);
		linked.add(4);
		linked.add(5);
		linked.add(6);
		System.out.println(linked.findIndex(5));
	}

	@Test
	public void testRemoveIndex() {
		OneWayLinkedList<Integer> linked = create();
		linked.add(3);
		linked.add(4);
		linked.add(5);
		linked.add(6);
		linked.remove(5);
		linked.print();
	}

	@Test
	public void testRemove() {
		OneWayLinkedList<Integer> linked = create();
		linked.add(3);
		linked.add(4);
		linked.add(5);
		linked.add(6);
		linked.removeIndex(1);
		linked.print();
	}

	@Test
	public void testSize() {
		OneWayLinkedList<Integer> linked = create();
		linked.add(3);
		linked.add(4);
		linked.add(5);
		linked.add(6);
		System.out.println(linked.size());
	}

}
