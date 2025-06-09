package doublylinkedlist;

public class DeleteOperations {
	
	public Node deleteHead(Node node) {
		if(node == null || node.getNext() == null) return null;
		Node temp = node;
		node = node.getNext();
		node.setPrev(null);
		temp.setNext(null);
		return node;
	}
	
	public Node deleteTail(Node node) {
		if(node == null || node.getNext() == null) return null;
		
		Node temp = node;
		while(temp.getNext().getNext() != null) temp = temp.getNext();
		
		Node last = temp.getNext();
		last.setPrev(null);
		temp.setNext(null);
		return node;
	}
	
	public Node deleteKthElement(Node node, int k) {
		if(k == 1) return deleteHead(node);
		
		Node temp = node;
		for(int i = 1; i < k - 1; i++) {
			temp = temp.getNext();
			if(temp == null || temp.getNext() == null) return node;
		}
		
		Node kthElement = temp.getNext();
		Node k1ThElement = temp.getNext().getNext();
		temp.setNext(kthElement.getNext());
		kthElement.setPrev(null);
		kthElement.setNext(null);
		if(k1ThElement != null)
			k1ThElement.setPrev(temp);
		return node;
	}
}
