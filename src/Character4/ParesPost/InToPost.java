package Character4.ParesPost;

import Character4.Stack.StackX;

public class InToPost {

	private StackX theStack;

	private String input;

	private String output = "";

	public InToPost(String input) {
		this.input = input;
		theStack = new StackX(this.input.length());
	}

	public String doTrans() {
		for (int j = 0; j < input.length(); j++) {
			char ch = input.charAt(j);
			switch (ch) {
				case '+':
				case '-':
					getOper(ch, 1);
					break;
				case '*':
				case '/':
					getOper(ch, 2);
					break;
				case '(':
					theStack.push(ch);
					break;
				case ')':
					getParen(ch);
					break;
				default:
					output = output + ch;
					break;
			}
		}
		while (!theStack.isEmpty()) {
			output += theStack.pop();
		}
		return output;
	}

	public void getOper(char opThis, int prec1) {
		while (!theStack.isEmpty()) {
			char opTop = theStack.pop();
			if (opTop == '(') {
				theStack.push(opTop);
				break;
			} else {
				int prec2;
				if (opTop == '+' || opTop == '-') {
					prec2 = 1;
				} else {
					prec2 = 2;
				}
				if (prec2 < prec1) {
					theStack.push(opTop);
					break;
				} else {
					output = output + opTop;
				}
			}
		}
		theStack.push(opThis);
	}

	public void getParen(char ch) {
		while (!theStack.isEmpty()) {
			char chx = theStack.pop();
			if (chx == '(') {
				break;
			} else {
				output = output + chx;
			}
		}
	}
}
