package com.stream.list;

public class LinkedListMain {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	static class LinkedList {

		public static Node reverse(Node head) {
			Node prev = null;

			while (head != null) {
				Node next = head.next;
				head.next = prev;
				prev = head;
				head = next;
			}

			return prev;
		}

		public static void main(String[] args) {

			Node head = new Node(1);
			head.next = new Node(2);
			head.next.next = new Node(3);
			head.next.next.next = new Node(4);

			head = reverse(head);

			while (head != null) {
				System.err.println(head.data + "");
				head = head.next;
			}
		}
	}
}