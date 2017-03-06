package Character5.LinkStack;

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

	//从第一个节点插入
	public void insertFirst(long dd) {
		Link newLink = new Link(dd);
		newLink.next = first;
		first = newLink;
	}

	//删除第一个节点
	public Link deleteFirst() {
		if (isEmpty()) {
			System.out.println("链表为空！无法删除");
			return null;
		}
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
