package Character6.homework;

import java.util.HashSet;
import java.util.Set;

public class Team5 {

	public static String[] items = { "A", "B", "C", "D", "E" };

	public static Set<String> rs = new HashSet<String>();

	public static void main(String[] args) {
		seek(5, 3, "");
		for (String s : rs) {
			System.out.print(s + " ");
		}
	}

	public static void seek(int n, int k, String temp) {
		if (k > 1) {
			seek(n - 1, k - 1, temp + items[items.length - n]);
		}
		if (n > k) {
			seek(n - 1, k, temp);
		}
		if (k == 1) {
			for (int i = items.length - n; i < items.length; i++) {
				String templn = temp + items[i];
				rs.add(templn);
			}
		}
		String templn = temp;
		if (k != 1 && k == n) {
			for (int i = items.length - n; i < items.length; i++) {
				templn = templn + items[i];
			}
			rs.add(templn);
		}
	}
}
