package com.tansun.util;

public class OneWayLinkedList<T> {

	private Node head;
	private int size;
	
	public void add(T t) {
		if(head == null) {
			head = new Node();
		}
		head.add(t);
	}
	
	public void add(T t, int index) {
		if(head == null) {
			head = new Node();
		}
		head.add(t,index);
	}
	
	public T find(int index) {
		if(index == 0 || index > Integer.MAX_VALUE){
			return null;
		}
		return head.find(index);
	}
	
	public int findIndex(T t) {
		return head.find(t);
	}
	
	public T removeIndex(int index) {
		if(index == 0 || index > Integer.MAX_VALUE){
			return null;
		}
		return head.removeIndex(index);
	}
	
	public T remove(T t) {
		return head.remove(t);
	}
	
	public int size() {
		return size;
	}
	
	private class Node {
		private T o;
		private Node next;
		
		
		public Node() {
			super();
		}
		public Node(T o, Node next) {
			super();
			this.o = o;
			this.next = next;
		}
		
		public void add(T t) {
			head = new Node(t, this);
		}
		
		public T remove(T t) {
			Node result = null;
			Node pre = this;
			if(o.equals(t)){
				result = this;
				head = this.next;
				return result.o;
			}
			while(pre.next != null) {
				if(pre.next.o.equals(t)) {
					result = pre.next;
					pre.next = pre.next.next;
					return result.o;
				}
				pre = pre.next;
			}
			return null;
		}
		public T removeIndex(int index) {
			if(index >= size || index < 0) {
				return null;
			} 
			Node result = null;
			if(index == 0) {
				result = this;
				head = this.next;
				return result.o;
			}
			Node pre = this;
			
			
			return null;
		}
		public int find(T t) {
			// TODO Auto-generated method stub
			return 0;
		}
		public T find(int index) {
			// TODO Auto-generated method stub
			return null;
		}
		public void add(T t, int index) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
