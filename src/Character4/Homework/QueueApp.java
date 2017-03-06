package Character4.Homework;

import Character4.Queue.Queue;

public class QueueApp {

	public static void main(String[] args) {
		int maxSize = 5;
		Queue que = new Queue(maxSize);
		que.display();
		que.insert(1);
		que.insert(2);
		que.insert(3);
		que.insert(4);
		que.insert(5);
		que.display();
		que.remove();
		que.remove();
		que.remove();
		que.display();
		que.insert(1);
		que.insert(2);
		que.insert(3);
		que.display();
	}
}
