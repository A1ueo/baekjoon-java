
import _dataStructure.MyLinkedList;
import _dataStructure.MyList;


public class Main {

	public static void main(String[] args) {
		MyList<Integer> lst = new MyLinkedList<>();

		lst.add(1);
		lst.add(2);
		lst.add(1, 3);
		System.out.println(lst);
	}
}
