package Character4.ParesPost;

import Character4.Stack.StackX;

/**
 * 单词逆序输出
 * @author 林华钊
 *
 */
public class Reverser {

	private String input;

	private String output;

	public Reverser(String input) {
		this.input = input;
	}

	public String doRev() {
		int length = input.length();
		StackX s = new StackX(length);
		for (int i = 0; i < length; i++) {
			s.push(input.charAt(i));
		}
		output = "";
		for (int i = 0; i < length; i++) {
			output += s.pop();
		}
		return output;
	}
}
