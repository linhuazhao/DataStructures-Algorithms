package Character4.ParesPost;

public class infix {

	private int maxSize;

	private char[] stackArray;

	private int top;

	public infix(int maxSize) {
		this.maxSize = maxSize;
		stackArray = new char[this.maxSize];
		top = -1;
	}

	public void push(char c) {
		stackArray[++top] = c;
	}

	public char pop() {
		return stackArray[top--];
	}

	public char peak() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int size() {
		return top + 1;
	}

	public char peakN(int n) {
		return stackArray[n];
	}

	public void displayStack(String s) {
		System.out.println(s);
		System.out.println("Stack (bottom-->top):");
		for (int j = 0; j < size(); j++) {
			System.out.print(peakN(j) + " ");
		}
		System.out.println();
	}
}
