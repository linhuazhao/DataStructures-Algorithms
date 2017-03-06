package Character6;

import java.util.Scanner;

public class TriangleApp {

	static int theNumber;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(triangle(in.nextInt()));
	}

	public static int triangle(int n) {
		if (n == 1) {
			return n;
		} else {
			return n + triangle(n - 1);
		}
	}
}
