package Character5.InsertIterator;

import Character5.DoublyLinked.Link;

/**
 * 单链表
 * @author HY112
 *
 */
public class LinkList {

	private Link first;

	public LinkList() {
		first = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public Link getFirst() {
		return first;
	}

	public void setFirst(Link first) {
		this.first = first;
	}

	public ListIterator getIterator() {
		return new ListIterator(this);
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
