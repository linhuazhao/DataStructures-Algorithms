package Character7.ShellSort;

/**
 * 希尔排序
 * @author HY112
 *
 */
public class ShellSort {

	public static void main(String[] args) {
		int max = 1000000;
		int[] a = new int[max];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 10 * max);
		}
		shellSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "	");
			if (i % 10 == 0)
				System.out.println();
		}
	}

	public static void shellSort(int a[]) {
		int length = a.length;
		int h = 1;
		int temp;
		while (h <= length / 3)
			h = h * 3 + 1;

		while (h > 0) {
			for (int j = h; j < length; j++) {
				temp = a[j];
				int i = j;
				while (i > h - 1 && a[i - h] >= temp) {
					a[i] = a[i - h];
					i -= h;
				}
				a[i] = temp;
			}
			h = (h - 1) / 3;
		}
	}
}
