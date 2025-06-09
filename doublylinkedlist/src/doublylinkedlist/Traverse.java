package doublylinkedlist;

public class Traverse {

	public void traverseFront(Node node){
		Node temp = node;
		while(temp != null) {
			System.out.print(temp.getValue());
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	public void traverseBack(Node node){
		Node temp = node;
		while(temp != null) {
			System.out.print(temp.getValue());
			temp = temp.getPrev();
		}
		System.out.println();
	}
}
