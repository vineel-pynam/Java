import java.util.*;

class LearnPriorityQueue{
	public static void main(String[] args){

		
		// Queue<Integer> q = new PriorityQueue<>();
		Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());

		q.offer(100);
		q.offer(8);
		q.offer(19);
		q.offer(40);


		System.out.println(q.peek());
		System.out.println(q.poll());
		

		System.out.println(q);
		
	}
}