package Character7.QuickSort;

public class QuickSort {

	private long[] a;

	private int size;

	public QuickSort(int size) {
		a = new long[size];
		this.size = 0;
	}

	public void insert(long value) {
		a[size++] = value;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public void quickSort() {
		recQuickSort(0, size - 1);
	}

	public void recQuickSort(int left, int right) {
		if (right <= left) {
			return;
		} else {
			int patition = paitition(left, right, a[right]);
			recQuickSort(left, patition - 1);
			recQuickSort(patition + 1, right);
		}
	}

	private int paitition(int left, int right, long pivot) {
		int leftPtr = left - 1;
		int rightPtr = right;
		while (true) {
			while (a[++leftPtr] < pivot)
				;
			while (rightPtr > 0 && a[--rightPtr] > pivot)
				;
			if (rightPtr <= leftPtr)
				break;
			else
				swap(leftPtr, rightPtr);
		}
		swap(leftPtr, right);
		return leftPtr;
	}

	private void swap(int i, int j) {
		long temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		int max = 10;
		QuickSort q = new QuickSort(max);
		for (int i = 0; i < max; i++) {
			q.insert((long) (Math.random() * max * 10));
		}
		q.quickSort();
		q.display();
	}
}
