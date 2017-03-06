package Character5.DoublyLinked;

/**
 * 双向双端链表
 * @author HY112
 *
 */
public class DoublyLinkList {

	private Link first;

	private Link last;

	public DoublyLinkList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	/**
	 * 头插入
	 */
	public void insertFirst(long value) {
		Link newLink = new Link(value);
		if (isEmpty()) {
			last = newLink;
		} else {
			first.previous = newLink;
		}
		newLink.next = first;
		first = newLink;
	}

	/**
	 * 尾插入
	 */
	public void insertLast(long value) {
		Link newLink = new Link(value);
		if (isEmpty()) {
			first = newLink;
		} else {
			last.next = newLink;
			newLink.previous = last;
		}
		last = newLink;
	}

	public Link deleteFirst() {
		Link temp = first;
		if (first.next == null) {
			last = null;
		} else {
			first.next.previous = null;
		}
		first = first.next;
		return temp;
	}

	public Link deleteLast() {
		Link temp = last;
		if (first.next == null) {
			first = null;
		} else {
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}

	/**
	 * 在key位置后插入value
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean insertAfter(long key, long value) {
		Link temp = first;
		while (temp != null) {
			if (temp.dData == key) {
				break;
			}
			temp = temp.next;
		}
		if (temp == null) {
			return false;
		}
		Link insert = new Link(value);
		if (temp == last) {
			insert.next = null;
			last = insert;
		} else {
			insert.next = temp.next;
			temp.next.previous = insert;
		}

		insert.previous = temp;
		temp.next = insert;

		return true;
	}

	/**
	 * 删除指定key
	 * @param key
	 * @return
	 */
	public Link deleteKey(long key) {
		Link current = first;
		while (current != null) {
			if (current.dData == key) {
				break;
			}
			current = current.next;
		}
		if (current == first) {
			return deleteFirst();
		}
		if (current == last) {
			return deleteLast();
		}
		current.previous.next = current.next;
		current.next.previous = current.previous;
		return current;
	}

	public void displayForward() {
		System.out.println("List (first-->last):");
		Link temp = first;
		while (temp != null) {
			temp.displayLink();
			temp = temp.next;
		}
		System.out.println();
	}

	public void displayBackward() {
		System.out.println("List (last-->first):");
		Link temp = last;
		while (temp != null) {
			temp.displayLink();
			temp = temp.previous;
		}
		System.out.println();
	}

}
