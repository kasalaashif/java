package QueueLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListDeepDive {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.add("Ashif");
		queue.add("Ashraf");
		queue.add("Ammaji");
		queue.add("Ashika");
		queue.add("Chand Basha");
		
		System.out.println(queue);
		// remove, peek, poll
		
		System.out.println(queue.peek());
		String poll = queue.poll();
		System.out.println(poll);
		
		// Iterate
		System.out.println("Iterate Over the Queue");
		for(String name : queue)
			System.out.println(name);
		
	}
}
