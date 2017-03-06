package Character5.Homework;

/**
 * Josephus问题
 * @author HY112
 *
 */
public class LoopLinkApp {

	public static void main(String[] args) {
		LoopLink link = new LoopLink();
		link.insert(1);
		link.insert(2);
		link.insert(3);
		link.insert(4);
		link.insert(5);
		link.insert(6);
		link.insert(7);
		link.step();
		int k = 1;
		while (link.size() > 1) {
			if (k % 4 == 0) {
				link.current.displayLink();
				link.removeCurrent();
			} else {
				link.step();
			}
			k++;
		}
		System.out.println();
		link.displayLoopLink();
	}
}
