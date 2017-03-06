package Character3;

public class App {
	public static void main(String[] args) {
		int max = 10;
		ArrayBub a = new ArrayBub(max);
		for (int i = 0; i < max; i++) {
			a.insert((long) (Math.random() * (max - 1)));
		}
		a.display();
		a.insertSort();
		a.display();
	}
}
