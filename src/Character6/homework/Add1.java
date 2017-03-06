package Character6.homework;

public class Add1 {

	public static void main(String[] args) {
		System.out.println(add(3, 3));
	}

	private static int add(int i, int j) {
		if (j == 1) {
			return i;
		} else {
			return i + add(i, j - 1);
		}
	}
}
