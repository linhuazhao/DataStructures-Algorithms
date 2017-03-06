package Character5.Homework;

import Character5.SortedList.SortedList;

/**
 * 优先级队列
 * @author HY112
 *
 */
public class PriorityQueue {

	private SortedList sortedList;

	public PriorityQueue() {
		sortedList = new SortedList();
	}

	public boolean isEmpty() {
		return sortedList.isEmpty();
	}

	public void insert(long value) {
		sortedList.insert(value);
	}

	public long remove() {
		if (isEmpty()) {
			return -1;
		}
		return sortedList.remove().dData;
	}

	public void displayQueue() {
		sortedList.display();
	}
}
