package Character5.FirstLastList;

/**
 * 双端链表
 * @author HY112
 *
 */
public class FirstLastList {

	private Link first;

	private Link last;

	public FirstLastList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(long value) {
		Link temp = new Link(value);
		if (isEmpty()) {
			last = temp;
		}
		temp.next = first;
		first = temp;
	}

	public void insertLast(long value) {
		Link temp = new Link(value);
		if (isEmpty()) {
			first = temp;
		} else {
			last.next = temp;
		}
		last = temp;
	}

	public Link deleteFirst() {
		Link temp = first;
		if (first.next == null) {
			last = null;
		}
		first = first.next;
		return temp;
	}

	//遍历
	public void display() {
		Link temp = first;
		while (temp != null) {
			temp.displayLink();
			temp = temp.next;
		}
		System.out.println();
	}
}
