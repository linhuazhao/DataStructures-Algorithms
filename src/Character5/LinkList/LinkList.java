package Character5.LinkList;

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
	public void insertFirst(int id, double dd) {
		Link newLink = new Link(id, dd);
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

	//查找指定关键字
	public Link find(int key) {
		Link temp = first;
		while (temp != null) {
			if (temp.iData == key) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}

	//删除指定节点
	public Link delete(int key) {
		Link temp = first;
		if (temp == null) {
			return null;
		}
		if (temp.iData == key) {
			return deleteFirst();
		}
		Link next = temp.next;
		while (next != null) {
			if (next.iData == key) {
				temp.next = next.next;
				return next;
			}
			temp = next;
			next = next.next;
		}
		return null;
	}
}
