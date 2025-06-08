package QueueLinkedList;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDeepDive {
	
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		
		pq.add("Ashif");
		pq.add("Ashraf");
		pq.add("Chand");
		pq.add("Ammaji");
		
		System.out.println(pq);
		
		PriorityQueue<String> pq1= new PriorityQueue<>(Collections.reverseOrder());
		
		pq1.add("Ashif");
		pq1.add("Ashif1");
		pq1.add("Ashif2");
		pq1.add("Ashif3");
		
		System.out.println(pq1);
		
		// cRud Read Operation
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		
		// crUd Update Functionality
		// No update
		
		// Iterate
		System.out.println("Iterating Over the Priority Queue");
		for(String name : pq)
			System.out.println(name);
		
		// Size, IsEmpty, Contains
		System.out.println(pq.size());
		System.out.println(pq.isEmpty());
		System.out.println(pq.contains("Ashif"));
		
	}

}
