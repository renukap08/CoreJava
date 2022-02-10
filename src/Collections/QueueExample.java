package Collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> pq1 = new PriorityQueue<String>();
        
        pq1.add("Jack");
        pq1.add("Jill");
        pq1.add("Jade");
        
        System.out.println(pq1);
        
        System.out.println("First Element " + pq1.peek());
        System.out.println("First Element " + pq1.poll());
        System.out.println(pq1);
            
        ArrayDeque<String> dq1 = new ArrayDeque<String>();
        
        dq1.add("Jack");
        dq1.add("Jill");
        dq1.add("Jade");
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
