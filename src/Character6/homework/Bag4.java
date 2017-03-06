package Character6.homework;

public class Bag4 {
	private boolean flag;

	private int[] bag;

	public Bag4(int[] bag) {
		this.bag = bag;
	}

	public boolean start(int target, int index) {
		for (int i = index; i < bag.length; i++) {
			if (bag[i] > target) {
				flag = false;
			} else if (bag[i] == target) {
				flag = true;
			} else if (bag[i] < target) {
				flag = start(target - bag[i], i + 1);
			}
			if (flag) {
				System.out.print(bag[i] + " ");
				return true;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		int[] bag = { 11, 8, 7, 6, 5 };
		Bag4 b = new Bag4(bag);
		b.start(31, 0);
	}
}
