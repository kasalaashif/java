package doublylinkedlist;

public class DoublyLinkedListMain {
	
	public static void main(String[] args) {
		
		// Traverse
		Traverse traverse = new Traverse();
		
		// DeleteOperations
		DeleteOperations deleteOperations = new DeleteOperations();
		
		// InsertOperations
		InsertOperations insertOperations = new InsertOperations();
		
		Node n1 = new Node(1, null, null);
		Node n2 = new Node(2, n1, null);
		Node n3 = new Node(3, n2, null);
		Node n4 = new Node(4, n3, null);
		Node n5 = new Node(5, n4, null);
		
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		
		// Traverse
		System.out.println("Traversal in Front");
		traverse.traverseFront(n1);	
		
		// Traverse
		System.out.println("Traversal in Back");
		traverse.traverseBack(n5);
		
		// deleteHead
		n1 = deleteOperations.deleteHead(n1);
		
		// Traverse
		System.out.println("Traversal in Front");
		traverse.traverseFront(n1);	
		
		//deleteTail
		n1 = deleteOperations.deleteTail(n1);
		
		// Traverse
		System.out.println("Traversal in Front");
		traverse.traverseFront(n1);	
		
		//deleteKthElement
		n1 = deleteOperations.deleteKthElement(n1, 1);
		
		// Traverse
		System.out.println("Traversal in Front");
		traverse.traverseFront(n1);
		
		// insertOperations
		n1 = insertOperations.insertHead(n1, 2);
		n1 = insertOperations.insertHead(n1, 1);
		n1 = insertOperations.insertHead(n1, 0);
		
		// Traverse
		System.out.println("Traversal in Front");
		traverse.traverseFront(n1);
		
		// insertOperations insertTail
		n1 = insertOperations.insertTail(n1, 5);
		n1 = insertOperations.insertTail(n1, 6);
		n1 = insertOperations.insertTail(n1, 7);
		n1 = deleteOperations.deleteHead(n1);
		
		// Traverse
		System.out.println("Traversal in Front");
		traverse.traverseFront(n1);

		// insertAtKthPosition
		n1 = insertOperations.insertAtKthPosition(n1, 8, 8);
		
		// Traverse
		System.out.println("Traversal in Front");
		traverse.traverseFront(n1);
		
		// insertBeforeGivenNode
		n1 = insertOperations.insertBeforeGivenNode(n1, 7, 9);
		
		// Traverse
		System.out.println("Traversal in Front");
		traverse.traverseFront(n1);
	}
}
