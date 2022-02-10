import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		
		pq1.add("pink");
		pq1.add("red");
		pq1.add("orange");
		
		System.out.println(pq1);
		
		System.out.println("First Element " + pq1.peek());
		System.out.println("First Element " + pq1.poll());
		
		System.out.println(pq1);
		
		
		ArrayDeque<String> dq1 = new ArrayDeque<String>();
		dq1.add("pink");
		dq1.add("red");
		dq1.add("orange");
		
		System.out.println(dq1);
		
		System.out.println(dq1.peek());
		System.out.println(dq1.peekFirst());
		System.out.println(dq1.peekLast());
		
		System.out.println(dq1.poll());
		//System.out.println(dq1.pollFirst());
		//System.out.println(dq1.pollLast());
		
		System.out.println(dq1);
	}

}
