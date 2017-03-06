package Character3;

/**
 * 第三章、排序
 * @author 林华钊
 *
 */
public class ArrayBub {

	private long[] a;

	private int nElems;

	public ArrayBub(int max) {
		a = new long[max];
		nElems = 0;
	}

	public int size() {
		return nElems;
	}

	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	//奇偶排序
	public void oddEvenSort() {
		boolean flag = true;
		while (flag) {
			boolean odd = false;
			boolean even = false;
			//偶数
			for (int i = 0; i < nElems - 1; i = i + 2) {
				if (a[i] > a[i + 1]) {
					swap(i, i + 1);
					odd = true;
				}
			}

			//奇数
			for (int i = 1; i < nElems - 1; i = i + 2) {
				if (a[i] > a[i + 1]) {
					swap(i, i + 1);
					even = true;
				}
			}
			flag = odd || even;
		}

	}

	//冒泡法，双向移动
	public void bubbleTwoSort() {
		for (int i = nElems - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					swap(j, j + 1);
				}
			}
			for (int j = i; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					swap(j, j - 1);
				}
			}
		}
	}

	//冒泡法
	public void bubbleSort() {
		for (int i = nElems - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					swap(j, j + 1);
				}
			}
		}
	}

	//选择排序
	public void selectSort() {
		for (int i = 0; i < nElems - 1; i++) {
			int min = i;
			for (int j = i + 1; j < nElems; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			swap(i, min);
		}
	}

	//插入排序
	public void insertSort() {
		int cmprCount = 0;
		int copyCount = 0;
		for (int i = 1; i < nElems; i++) {
			long value = a[i];
			int j = i;
			while (j > 0) {
				cmprCount++;
				if (a[j - 1] >= value) {
					copyCount++;
					a[j] = a[j - 1];
					j--;
				} else {
					break;
				}
			}
			a[j] = value;
		}
		System.out.println("插入排序比较的次数是： " + cmprCount);
		System.out.println("插入排序复制的次数是： " + copyCount);
	}

	//交换
	private void swap(int o, int t) {
		long k = a[o];
		a[o] = a[t];
		a[t] = k;
	}
}
