import java.util.*;

class LearnArrayDeque{
	public static void main(String[] args){

		ArrayDeque<Integer> q = new ArrayDeque<>();

		q.offer(1);
		q.offerFirst(2);
		q.offerLast(3);

		System.out.println(q);

		q.peek();
		q.peekFirst();
		q.peekLast();


		q.poll();
		q.pollFirst();
		q.pollLast();


	}

}