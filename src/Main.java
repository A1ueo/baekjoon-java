
import _dataStructure.MyLinkedList;
import _dataStructure.MyList;


public class Main {

	public static void main(String[] args) {
		MyList<String> lst = new MyLinkedList<>();

		lst.add("1");
		lst.add("3");
		lst.add(1, "2");
		System.out.println("remove " + lst.remove("3"));

		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
	}
}
