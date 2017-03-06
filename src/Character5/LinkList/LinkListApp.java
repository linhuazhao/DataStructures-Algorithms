package Character5.LinkList;

public class LinkListApp {

	public static void main(String[] args) {
		LinkList list = new LinkList();
		for (int i = 0; i < 5; i++) {
			list.insertFirst(i, i + 0.5);
		}
		Link delete = list.delete(2);
		if (delete != null) {
			delete.displayLink();
		} else {
			System.out.println("没有找到指定节点");
		}
		System.out.println();
		list.display();
	}
}
