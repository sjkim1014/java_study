package java12_collection.etc;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		
		Queue queue = new LinkedList<>();
		
		System.out.println("---offer---");
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		
		System.out.println(queue);
		System.out.println("ũ�� : "+queue.size());
		
		System.out.println("\n---��� poll()---");
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println("\n---��ȸ peek()---");
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println("ũ�� : "+queue.size());		
		
	}
}
