package Character5.LinkStack;

public class LinkStack {

	private LinkList theList;

	public LinkStack() {
		theList = new LinkList();
	}

	public void push(long value) {
		theList.insertFirst(value);
	}

	public long pop() {
		Link pop = theList.deleteFirst();
		return pop.dData;
	}

	public boolean isEmpty() {
		return theList.isEmpty();
	}

	public void displayStack() {
		theList.display();
	}
}
