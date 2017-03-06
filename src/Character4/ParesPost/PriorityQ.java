package Character4.ParesPost;

public class PriorityQ {

	private int maxSize;

	private long[] queArray;

	private int nItems;

	public PriorityQ(int maxSize) {
		this.maxSize = maxSize;
		queArray = new long[this.maxSize];
		nItems = 0;
	}

	public void insert(long item) {
		int j;

		if (nItems == 0)
			queArray[nItems++] = item;
		else {
			for (j = nItems - 1; j >= 0; j--) {
				if (item > queArray[j])
					queArray[j + 1] = queArray[j];
				else
					break;
			}
			queArray[j + 1] = item;
			nItems++;
		}
	}

	public long remove() {
		return queArray[--nItems];
	}

	public long peakMin() {
		return queArray[nItems - 1];
	}
}
