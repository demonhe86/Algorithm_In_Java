class Node {
	public int value;
	public Node next;
	public Node(int data) {
		this.value = data;
	}
}

public class PrintCommonPart {
	public static void printCommonPart(Node head1, Node head2) {
		while(head1 != null && head2 != null) {
			if (head1.value > head2.value) {
				head2 = head2.next;
			} else if (head1.value < head2.value) {
				head1 = head1.next;
			} else {
				System.out.println(head1.value);
				head1 = head1.next;
				head2 = head2.next;
			}
		}
	}

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;


		Node a1 = new Node(2);
		Node a2 = new Node(3);
		Node a3 = new Node(5);
		Node a4 = new Node(6);
		Node a5 = new Node(7);

		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = null;

		printCommonPart(n1, a1);

	} 
}


