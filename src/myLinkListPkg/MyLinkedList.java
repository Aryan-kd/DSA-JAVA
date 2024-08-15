package myLinkListPkg;

import java.lang.IllegalArgumentException;

class Node{
	public int data;
	public Node next = null;
	
	public Node(int value) {
		this.data = value;
	}
}


public class MyLinkedList {
	private Node head;
	private Node tail;
	
	public MyLinkedList() {
		head = null;
		tail = null;
	}
	
	public void insert(int value) {
		Node node = new Node(value);
		
		if(this.head == null) {
			this.head = node;
			this.tail = node;
		}else {
			this.tail.next = node;
			this.tail = node;
		}
		return;
	}
	
	public void insertHead(int value) {
		Node node = new Node(value);

		if(this.head == null) {
			this.head = node;
			this.tail = node;
		}else {
			node.next = this.head;
			this.head = node;
		}
		return;
	}
	
	public void insertAt(int value, int key) {
		Node node = new Node(value);
		
		if(this.head == null) {
			this.head = node;
			this.tail = node;
		}else {
			Node temp = this.head;
			int index = 0;
			while(temp != null) {
				if(index == key-2) {
					if(temp.next == null) {
						this.tail.next = node;
						this.tail = node;
						return;
					}
					node.next = temp.next;
					temp.next = node;
					return;
				}
				temp = temp.next;
				index++;
			}
			throw new IllegalArgumentException("Index is out of bound");
		}
	}
	
	public void reverse() {
		if(this.head == null) {
			return;
		}
		this.tail = this.head;
		Node temp = this.head;
		this.head = this.head.next;
		while(head != null) {
			Node temp2 = this.head.next;
			this.head.next = temp;
			temp = this.head;
			this.head = temp2;
		}
		this.head = temp;
		this.tail.next = null;
		return;
	}
	
	public void deleteHead() {
		if(head == null) return;
		Node temp = head;
		head = head.next;
		temp.next = null;
		return;
	}
	
	public void deleteTail() {
		if(head == null) return;
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		tail = temp;
		temp.next = null;
		tail.next = null;
	}
	
	public void deleteAtN(int n) {
		if(head == null) return;
		if(n == 0) {
			deleteHead();
			return;
		}
		Node temp = head;
		if(n==1) {
			Node prev = temp;
			temp = temp.next;
			prev.next = temp.next;
			return;
		}
		int ind = 1;
		while(temp.next != null) {
			if(ind == n-1) {
				if(temp.next.next == null) {
					tail = temp;
					temp.next = null;
					return;
				}
				Node prev = temp;
				temp = temp.next;
				prev.next = temp.next;
				return;
			}
			temp = temp.next;
			ind++;
		}
		throw new IllegalArgumentException("Index is out of bound");
	}
	
	private void printRec(Node node) {
		if(node == null) return;
		System.out.print(node.data + " ");
		printRec(node.next);
		return;
	}
	
	public Node reverseRec(Node node) {
		if(node == null || node.next == null) return node;
		
		Node temp = reverseRec(node.next);
		
		Node next = node.next;
		next.next = node;
		node.next = null;
		
		return temp;
	}
	
	public void reverseRec() {
		head = reverseRec(head);
		return;
	}
	
	public void print() {
		System.out.print("[ ");
		printRec(head);
		System.out.print("]");
		System.out.println();
		return;
	}
	
	public String toString() {
		Node temp = this.head;
		StringBuilder str = new StringBuilder();
		str.append("[ ");
		while(temp != null) {
			str.append(temp.data).append(" ");
			temp = temp.next;
		}
		str.append("]");
		return str.toString();
	}
}
