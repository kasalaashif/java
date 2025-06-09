package doublylinkedlist;

public class InsertOperations {
	
	public Node insertHead(Node node, int x) {
		Node newHead = new Node(x, null, null);
		if(node == null) return newHead;
		newHead.setNext(node);
		node.setPrev(newHead);
		return newHead;
	}
	
	public Node insertTail(Node node, int x) {
		Node newHead = new Node(x, null, null);
		if(node == null) return newHead;
		Node temp = node;
		while(temp.getNext() != null) temp = temp.getNext();
		
		temp.setNext(newHead);
		newHead.setPrev(temp);
		
		return node;
	}
	
	public Node insertAtKthPosition(Node node, int k, int x) {
		Node newHead = new Node(x, null, null);
		if(node == null) return newHead;
		
		Node temp = node;
		for(int i = 1; i < k - 1; i++) {
			if(temp == null || temp.getNext() == null) return node;
			temp = temp.getNext();
		}
		Node kthElement = temp.getNext();
		
		newHead.setPrev(temp);
		newHead.setNext(kthElement);
		temp.setNext(newHead);

		if(kthElement != null) kthElement.setPrev(newHead);
		
		return node;
	}
	
	public Node insertBeforeGivenNode(Node node, int givenNodeValue, int x) {
		
		if(node == null || node.getValue() == givenNodeValue) 
			return insertHead(node, x);
		
		Node temp = node;
		while(temp.getValue() != givenNodeValue) {
			if(temp.getNext() == null) return node;
			temp = temp.getNext();
		}
	
		Node kBefore = temp.getPrev();
		Node newElement = new Node(x, kBefore, temp);
		kBefore.setNext(newElement);
		temp.setPrev(newElement);
		return node;
	}
}
