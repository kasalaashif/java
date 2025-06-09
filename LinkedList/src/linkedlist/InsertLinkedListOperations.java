package linkedlist;

public class InsertLinkedListOperations{
	
	public Node insertAtHead(Node head, int x) {
		Node newHead = new Node(x, head);
		if(head == null)
			return newHead;
		head = newHead;
		return head;
	}
	
	public Node insertAtEnd(Node head, int x) {
		Node newHead = new Node(x, null);
		if(head == null) return newHead;
		
		Node temp = head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(newHead);
		return head;
	}
	
	public Node insertAtPositionX(Node head, int x, int k) {
		if(k == 1) return insertAtHead(head, x); 
		
		Node temp = head;
		for(int i = 1; i < k - 1; i++) {
			if (temp == null) return head; 
			temp = temp.getNext();
		}
		Node newNode = new Node(x, null);
		if(temp.getNext() != null){
			Node next = temp.getNext().getNext();
			newNode.setNext(next);
			temp.setNext(newNode);
		}
		temp.setNext(newNode);
		return head;
	}
	
	public Node insertBeforeValueX(Node head, int x, int value) {
		if(head == null)
			return null;
		if(head.getValue() == x)
			return insertAtHead(head, x);
		Node temp = head;
		while(temp.getNext() != null) {
			if(temp.getNext().getValue() == x) {
				Node next = temp.getNext();
				Node newNode = new Node(value, next);
				temp.setNext(newNode);
				break;
			}
			temp = temp.getNext();
		}
		return head;
	}

}
