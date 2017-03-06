package Character5.SortedList;

import Character5.LinkStack.Link;

/**
 * 有序链表
 * @author HY112
 *
 */
public class SortedList {

	private Link first;

	public SortedList() {
		this.first = null;
	}

	public SortedList(Link[] links) {
		this.first = null;
		for (Link link : links) {
			insert(link.dData);
		}
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insert(long value) {
		Link newLink = new Link(value);
		Link previous = null;
		Link current = first;
		while (current != null && current.dData > value) {
			previous = current;
			current = current.next;
		}
		if (previous == null) {
			first = newLink;
		} else {
			previous.next = newLink;
		}
		newLink.next = current;
	}

	public Link remove() {
		Link temp = first;
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
