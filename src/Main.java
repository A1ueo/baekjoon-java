
public class Main {

	public static void main(String[] args) {
		MyArrayList<Integer> list = new MyArrayList<>();

		list.add(0, 1);
		list.add(0, 1);
		list.add(0, 1);
		list.clear();
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
}
