package com.tansun.util;

public class OneWayLinkedList<T> {

	private Node head;
	private int size;
	
	
	public void print() {
		head.print();
	}
	public void add(T t) {
		size++;
		if(head == null) {
			head = new Node();
			head.o = t;
		} else {
			head.add(t);
		}
	}
	
	public void add(T t, int index) {
		size++;
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
		size--;
		if(index == 0 || index > Integer.MAX_VALUE){
			return null;
		}
		return head.removeIndex(index);
	}
	
	public T remove(T t) {
		size --;
		return head.remove(t);
	}
	
	public void turn() {
		head.turn();
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
		public void turn() {
			
			Node first = head;
			Node now = head.next;
			Node next = now.next;
			first.next = null;
			while(next != null) {
				now.next = first;
				first = now;
				now = next;
				next = now.next;
			}
			head = first;
		}
		public void print() {
			StringBuilder s = new StringBuilder("[");
			Node pre = head;
			while(pre != null) {
				s.append(pre.o + ",");
				pre = pre.next;
			}
			s.append("]");
			System.out.println(s.toString().replaceAll(",]", "]"));
			
			
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
			int i = 0;
			while(i <size) {
				i++;
				if(i == index) {
					Node tmp = pre;
					pre = pre.next;
					tmp.next = pre.next;
				} else {
					pre = pre.next;
				}
				
			}
			return pre.o;
		}
		public int find(T t) {
			Node pre = this;
			int i = 0;
			while(pre != null) {
				if(pre.o.equals(t))
					return i;
				pre = pre.next;
				i++;
			}
			return -1;
		}
		public T find(int index) {
			Node pre = this;
			int i = 0;
			
			while(pre.next != null) {
				if(i == index)
					return pre.o;
				pre = pre.next;
				i++;
			}
			return null;
		}
		public void add(T t, int index) {
			if(index == 0) {
				head = new Node(t, this);
			} else {
				Node pre = this;
				int i = 0;
				
				while(pre.next != null) {
					i++;
					if(i == index){
						pre.next = new Node(t, pre.next);
					}
					pre = pre.next;
				}
			}
		}
	}
}
