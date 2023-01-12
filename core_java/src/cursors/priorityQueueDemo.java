package cursors;
import java.util.PriorityQueue;
public class priorityQueueDemo {
	public static void main(String[] args) {
	PriorityQueue pq = new PriorityQueue();
	pq.offer("chetha");
	pq.offer("teja");
	pq.offer("manu");
	pq.offer("teja");
	pq.offer("neha");
	System.out.println(pq);
	System.out.println(pq.peek());
	System.out.println(pq.poll());
	System.out.println(pq);
	
	

}
}