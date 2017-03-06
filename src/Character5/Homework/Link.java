package Character5.Homework;

/**
 * 二维链表节点
 * @author HY112
 *
 */
public class Link {

	public Link next;

	public Link right;

	public long value;

	public Link() {
		next = null;
		right = null;
		value = 0;
	}

	public Link(long value) {
		this.value = value;
		next = null;
		right = null;
	}

	public void displayLink() {
		System.out.print("{" + this.value + "}");
	}
}
