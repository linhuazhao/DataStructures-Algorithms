package Character8.Tree;

public class TreeApp {
	public static void main(String[] args) {
		Tree t = new Tree();
		for (int i = 0; i < 10; i++) {
			t.insert((int) (Math.random() * 100), Math.random());
		}
		t.traverse(1);
		t.displayTree();
	}
}
