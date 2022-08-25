package questThree;

import java.util.LinkedList;

public class Queue {

	public static void main(String[] args) {
		Queue<Person> queue = new LinkedList<Person>();
		queue.offer(new Person());
		queue.peek();
		queue.poll();
		queue.size();
		
		
	}
}

class Person {}