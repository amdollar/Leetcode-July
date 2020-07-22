package io.test.Week3;

public class RemoveLinkedListElements {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		ListNode first = new ListNode(2);
		node.next = first;
		ListNode second = new ListNode(6);
		first.next = second;
		ListNode third = new ListNode(3);
		second.next = third;
		ListNode fourth = new ListNode(6);
		third.next = fourth;
		int value = 6;
		System.out.println("Old ");
		printList(node);
		System.out.println("New");
		ListNode newNode = removeElements(node, value);
		printList(newNode);

	}

	private static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}

	private static ListNode removeElements(ListNode head, int value) {
		if (head == null)
			return null;
		head.next = removeElements(head.next, value);
		return head.val == value ? head.next : head;

	}
}
