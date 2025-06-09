package linkedlist;

public class LinkedListDeepDive {

	public static void main(String[] args) {
		
		DeleteLinkedListOperations deleteOperation = new DeleteLinkedListOperations();
		LinkedListTraverseOperation iterator = new LinkedListTraverseOperation();
		InsertLinkedListOperations insertOperation = new InsertLinkedListOperations();
		
		Node n1 = new Node(1, null);
		Node n2 = new Node(2, null);
		Node n3 = new Node(3, null);
		Node n4 = new Node(4, null);
		
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		
		// Traverse
		iterator.traverseList(n1);
		
		// delete Head Node
		n1 = deleteOperation.deleteHead(n1);
		
		// Traverse
		iterator.traverseList(n1);
		
		// delete Tail Node
		n1 = deleteOperation.deleteTail(n1);
		
		// Traverse
		iterator.traverseList(n1);
		
		// delete kth Node
		n1 = deleteOperation.deleteKthElement(n1, 2);
				
		//Traverse
		iterator.traverseList(n1);
	
		// deleteElementWithValueX
		n1 = deleteOperation.deleteElementWithValueX(n1, 2);
		
		//Traverse
		iterator.traverseList(n1);
		
		// Insert at head
		n1 = insertOperation.insertAtHead(n1, 1);
		
		//Traverse
		iterator.traverseList(n1);
		
		// Insert at End
		n1 = insertOperation.insertAtEnd(n1, 2);
				
		//Traverse
		iterator.traverseList(n1);
		
		// insertAtPositionX
		n1 = insertOperation.insertAtPositionX(n1, 3, 3);
		
		//Traverse
		iterator.traverseList(n1);
		
		// insertAtPositionX
		n1 = insertOperation.insertAtPositionX(n1, 4, 2);
				
		//Traverse
		iterator.traverseList(n1);
		
		// insertBeforeValueX
		n1 = insertOperation.insertBeforeValueX(n1, 4, 3);
		n1 = insertOperation.insertBeforeValueX(n1, 3, 7);
		n1 = deleteOperation.deleteElementWithValueX(n1, 3);
		
		//Traverse
		iterator.traverseList(n1);
		
	}
}
