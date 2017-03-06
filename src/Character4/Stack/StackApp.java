package Character4.Stack;

public class StackApp {
	public static void main(String[] args) {
		int max = 5;
		StackX s = new StackX(max);
		int hashCode = s.hashCode();
		System.out.println(hashCode);
	}
}
