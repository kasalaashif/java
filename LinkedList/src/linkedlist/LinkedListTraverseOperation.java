package linkedlist;

public class LinkedListTraverseOperation {
	
	public void traverseList(Node node) {
		Node iterator= node;
		while(iterator != null) {
			System.out.print(iterator.getValue());
			iterator = iterator.getNext();
		}
		System.out.println();
	}
}
