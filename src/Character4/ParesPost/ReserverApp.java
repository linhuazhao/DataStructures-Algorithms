package Character4.ParesPost;

import java.util.Scanner;

public class ReserverApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Reverser re = new Reverser(in.next());
		System.out.println(re.doRev());
	}
}
