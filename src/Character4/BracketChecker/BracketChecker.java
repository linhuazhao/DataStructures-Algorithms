package Character4.BracketChecker;

import Character4.Stack.StackX;

public class BracketChecker {

	private String input;

	public BracketChecker(String input) {
		this.input = input;
	}

	public void check() {
		int length = input.length();
		StackX s = new StackX(length);
		for (int i = 0; i < length; i++) {
			char charAt = input.charAt(i);
			switch (charAt) {
				case '{':
				case '[':
				case '(':
					s.push(charAt);
					break;
				case '}':
				case ']':
				case ')':
					if (!s.isEmpty()) {
						char pop = s.pop();
						if (charAt == '}' && pop != '{' || charAt == ']' && pop != '[' || charAt == ')' && pop != '(') {
							System.out.println("错误！栈中位置为" + i + "的" + charAt + "括号不匹配");
						}
					} else {
						System.out.println("错误！栈中没有元素！");
					}
					break;
				default:
					break;
			}
		}
		if (!s.isEmpty()) {
			System.out.println("栈中仍有括号存在，不匹配！");
		}
	}
}
