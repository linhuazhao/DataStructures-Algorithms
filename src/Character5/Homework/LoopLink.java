package Character5.Homework;

import Character5.LinkStack.Link;

/**
 * 循环单链表
 * @author HY112
 *
 */
public class LoopLink {

	public Link current;

	private int count;

	public LoopLink() {
		current = null;
		count = 0;
	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public void insert(long value) {
		Link insert = new Link(value);
		//空的时候
		if (current == null) {
			current = insert;
		} else if (current.next == null) {
			//只有一个元素的时候
			current.next = insert;
			insert.next = current;
			current = insert;
		} else {
			insert.next = current.next;
			current.next = insert;
			current = insert;
		}
		count++;
	}

	public void remove(long value) {
		if (count == 0) {
			System.out.println("链表为空！无法删除!");
			return;
		}
		Link temp = current;
		int sum = count;
		boolean flag = true;
		while (sum > 0) {
			if (temp.dData == value) {
				flag = false;
				break;
			}
			temp = temp.next;
			sum--;
		}
		if (flag) {
			System.out.println("链表为不存在该元素！无法删除!");
			return;
		}
		if (temp.next == null) {
			//只有一个元素
			current = null;
		} else if (temp.next.next == temp) {
			//只有两个元素
			temp.next.next = null;
			current = temp.next;
		} else {
			Link previous = current;
			while (previous.next != temp) {
				previous = previous.next;
			}
			previous.next = temp.next;
			current = temp.next;
		}
		count--;
	}

	public void removeCurrent() {
		if (count == 0) {
			System.out.println("链表为空！无法删除!");
			return;
		}
		Link temp = current;
		if (temp.next == null) {
			//只有一个元素
			current = null;
		} else if (temp.next.next == temp) {
			//只有两个元素
			temp.next.next = null;
			current = temp.next;
		} else {
			Link previous = current;
			while (previous.next != temp) {
				previous = previous.next;
			}
			previous.next = temp.next;
			current = temp.next;
		}
		count--;
	}

	public void step() {
		if (isEmpty() || count == 1) {
			System.out.println("当前链表为空或只有一个元素！无法移动当前节点");
			return;
		}
		current = current.next;
	}

	public void backStep() {
		if (isEmpty() || count == 1) {
			return;
		}
		Link previous = current;
		while (previous.next != current) {
			previous = previous.next;
		}
		current = previous;
	}

	public void displayLoopLink() {
		int sum = count;
		Link temp = current;
		while (sum > 0) {
			temp.displayLink();
			temp = temp.next;
			sum--;
		}
		System.out.println();
	}
}
