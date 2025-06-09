package linkedlist;

public class DeleteLinkedListOperations {
	
	public Node deleteHead(Node node) {
		if(node == null)
			return node;
		
		Node temp = node;
		node = node.getNext();
		temp.setNext(null);
		
		return node;
	}
	
	public Node deleteTail(Node node) {
		
		if(node == null || node.getNext() == null)
			return null;
	
		Node temp = node;	
		while(temp.getNext().getNext() != null)
			temp = temp.getNext();
	
		temp.setNext(null);	
		return node;
	}
	
	public Node deleteKthElement(Node node, int k) {
		if(node == null)
			return null;
		if(k == 1)
			return deleteHead(node);
		
		Node temp = node;
		
		for(int i = 1; i < k - 1; i++) 
			temp = temp.getNext();
		
		temp.setNext(temp.getNext().getNext());
		
		return node;
	}
	
	public Node deleteElementWithValueX(Node node, int x) {
		if(node == null)
			return null;
		
		if(node.getValue() == x)
			return deleteHead(node);
		
		Node temp = node;
		
		while(temp.getNext() != null) {
			if(temp.getNext().getValue() == x) {
				temp.setNext(temp.getNext().getNext());
				break;
			}
			temp = temp.getNext();
		}
		return node;
	}
}
