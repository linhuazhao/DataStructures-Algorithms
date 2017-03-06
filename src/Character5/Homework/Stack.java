package Character5.Homework;

import Character5.LinkStack.Link;

public class Stack {

	private LoopLink link;

	public Stack() {
		link = new LoopLink();
	}

	public boolean isEmpty() {
		return link.isEmpty();
	}

	public void push(long value) {
		link.insert(value);
	}

	public long pop() {
		Link temp = link.current;
		link.removeCurrent();
		link.backStep();
		return temp.dData;
	}
}
