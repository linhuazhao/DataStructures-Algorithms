package Character4.ParesPost;

import Character4.Stack.StackInt;

public class ParesPost {

	private StackInt theStack;

	private String input;

	public ParesPost(String input) {
		this.input = input;
		theStack = new StackInt(input.length());
	}

	public int doPares() {
		char ch;
		int j;
		int num1, num2, interAns;
		for (j = 0; j < input.length(); j++) {
			ch = input.charAt(j);
			if (ch >= '0' && ch <= '9') {
				theStack.push((int) ch - '0');
			} else {
				num2 = theStack.pop();
				num1 = theStack.pop();
				switch (ch) {
					case '+':
						interAns = num1 + num2;
						break;
					case '-':
						interAns = num1 - num2;
						break;
					case '*':
						interAns = num1 * num2;
						break;
					case '/':
						interAns = num1 / num2;
						break;

					default:
						interAns = 0;
						break;
				}
				theStack.push(interAns);
			}
		}
		return theStack.pop();
	}
}
