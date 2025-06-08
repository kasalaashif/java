package QueueLinkedList;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDeepDive {

	public static void main(String[] args) {
		Deque<String> queue = new ArrayDeque<>();
		
		// Crud Create Operation
		queue.add("Ashif");
		queue.addFirst("Ashraf");
		queue.addLast("Ashika");
		queue.addAll(new ArrayDeque<>(queue));
		
		// cRud Read Operation
		System.out.println(queue.peekFirst());
		System.out.println(queue.peekLast());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.pollFirst());
		System.out.println(queue.pollLast());
		
		System.out.println(queue);
		
		// crUd Update operation
		// No Update Operations
		
		// Iteration
		for(String name: queue)
			System.out.println(name);
		// delete
		queue.remove();
		queue.removeFirst();
		queue.removeLast();
		queue.removeAll(queue);
		
		// isEmpty Size 
		queue.isEmpty();
		queue.size();
		
	}

}
