package Character4.Stack;

/**
 * 栈
 * @author 林华钊
 *
 */
public class StackInt {

	private int maxSize;

	private int[] stackArray;

	private int top;

	public StackInt(int max) {
		maxSize = max;
		stackArray = new int[maxSize];
		top = -1;
	}

	public void push(int value) {
		stackArray[++top] = value;
	}

	public int pop() {
		return stackArray[top--];
	}

	public int peak() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == (maxSize - 1);
	}
}
