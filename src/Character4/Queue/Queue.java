package Character4.Queue;

public class Queue {

	private int maxSize;

	private long[] queArray;

	private int front;

	private int rear;

	private int nItems;

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		front = 0;
		nItems = 0;
		rear = -1;
		queArray = new long[this.maxSize];
	}

	public void insert(long value) {
		if (rear == maxSize - 1) {
			rear = -1;
		}
		queArray[++rear] = value;
		nItems++;
	}

	public long remove() {
		long temp = queArray[front++];
		if (front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}

	public long peakFront() {
		return queArray[front];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

	public int size() {
		return nItems;
	}

	public void display() {
		int count = nItems;
		int head = front;
		while (count > 0) {
			long temp = queArray[head++];
			if (head == maxSize) {
				head = 0;
			}
			System.out.print(temp + " ");
			count--;
		}
		System.out.println();
	}
}
