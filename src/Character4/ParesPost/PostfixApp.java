package Character4.ParesPost;

import java.util.Scanner;

public class PostfixApp {
	public static void main(String[] args) {
		System.out.println("请输入中缀表达式（例：3+5*6）：");
		Scanner in = new Scanner(System.in);
		InToPost tran = new InToPost(in.next());
		String doTrans = tran.doTrans();
		System.out.println("后缀表达式为：");
		System.out.println(doTrans);
		ParesPost pe = new ParesPost(doTrans);
		System.out.println(pe.doPares());
	}
}
