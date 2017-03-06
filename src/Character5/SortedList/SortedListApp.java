package Character5.SortedList;

public class SortedListApp {

	public static void main(String[] args) {
		SortedList list = new SortedList();
		int max = 10;
		for (int i = 0; i < max; i++) {
			list.insert((long) (Math.random() * (max)));
		}
		list.display();
	}
}
