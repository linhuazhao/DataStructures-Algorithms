package Character5.Homework;

/**
 * 二维链表
 * @author HY112
 *
 */
public class DoubleLink {

	public Link first;

	private int a;

	private int b;

	/**
	 * 新建a*b大小的二维链表
	 * @param a
	 * @param b
	 */
	public DoubleLink(int a, int b) {
		this.a = a;
		this.b = b;
		first = new Link();

		createWidth(first, b);
		createHight(first, a);
		createOther(first);
	}

	private void createOther(Link first) {
		for (int i = 1; i < b; i++) {
			for (int j = 1; j < a; j++) {
				Link temp = new Link();
				Link left = getLink(i - 1, j);
				Link front = getLink(i, j - 1);
				front.next = temp;
				left.right = temp;
			}
		}
	}

	private Link createWidth(Link left, Integer i) {
		Link temp = new Link();
		left.right = temp;
		i--;
		if (i == 1) {
			return temp;
		} else {
			return createWidth(temp, i);
		}
	}

	private Link createHight(Link front, Integer i) {
		Link temp = new Link();
		front.next = temp;
		i--;
		if (i == 1) {
			return temp;
		} else {
			return createHight(temp, i);
		}
	}

	public Link getLink(int a, int b) {
		Link temp = first;
		for (int i = 0; i < a; i++) {
			temp = temp.right;
		}
		for (int i = 0; i < b; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void setValue(int a, int b, long value) {
		Link temp = first;
		for (int i = 0; i < a; i++) {
			temp = temp.right;
		}
		for (int i = 0; i < b; i++) {
			temp = temp.next;
		}
		temp.value = value;
	}

	public void display() {
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				getLink(i, j).displayLink();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		DoubleLink dl = new DoubleLink(3, 4);
		dl.display();
	}
}
