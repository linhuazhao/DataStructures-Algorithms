package Character4.ParesPost;

import java.util.Scanner;

public class InfixApp {
	public static void main(String[] args) {
		while (true) {
			Scanner in = new Scanner(System.in);
			InToPost tran = new InToPost(in.next());
			System.out.println(tran.doTrans());
		}
	}
}
