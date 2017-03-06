package Character4.BracketChecker;

import java.util.Scanner;

public class BracketsApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BracketChecker br = new BracketChecker(in.next());
		br.check();
	}
}
