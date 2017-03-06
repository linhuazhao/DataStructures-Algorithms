package Character5.SortedList;

import Character5.LinkStack.Link;

public class ListInsertionSortApp {

	public static void main(String[] args) {
		int max = 10;
		Link[] links = new Link[max];
		for (int i = 0; i < max; i++) {
			links[i] = new Link((long) (Math.random() * (max)));
			links[i].displayLink();
		}
		System.out.println();
		SortedList list = new SortedList(links);
		list.display();
	}
}
