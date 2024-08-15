package myLinkListPkg;

public class Main {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(2);
		list.insert(5);
		list.insert(8);
		list.insertHead(7);
		list.insertHead(12);
		list.insertHead(4);
		System.out.println(list);
		list.insertAt(21, 10);
		list.insert(22);
		list.insertAt(33, 12);
		System.out.println(list);
		list.reverse();
		System.out.println(list);
		list.deleteHead();
		list.deleteTail();
		list.deleteAtN(10);
		list.print();
		list.reverseRec();
		list.print();
	}
}
