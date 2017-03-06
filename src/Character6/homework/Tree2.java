package Character6.homework;

public class Tree2 {

	private String[] tree;

	private int max;

	private int pow;

	public Tree2(int max) {
		this.max = max;
		for (int i = 2; i <= max; i++) {
			this.pow = (int) Math.pow(2, i) - 1;
			tree = new String[pow];
			makeBranches(0, pow);
			display();
		}
	}

	public void makeBranches(int left, int right) {
		int mid = (left + right) / 2;
		if (mid % 2 == 0) {
			return;
		} else {
			tree[mid] = "X";
			makeBranches(mid, right);
			makeBranches(left, mid);
		}
	}

	public void display() {
		for (int i = 0; i < pow; i++) {
			if (tree[i] == null) {
				tree[i] = "-";
			}
			System.out.print(tree[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Tree2 t = new Tree2(5);
	}
}
