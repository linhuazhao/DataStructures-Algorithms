package Character5.LinkStack;

public class LinkStackApp {

	public static void main(String[] args) {
		LinkStack stack = new LinkStack();
		stack.push(1);
		stack.push(5);
		stack.push(6);
		stack.push(2);
		stack.push(3);
		stack.displayStack();

		stack.pop();
		stack.pop();
		stack.pop();

		stack.displayStack();
	}
}
