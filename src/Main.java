




public class Main {

    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        MyList<Integer> list = new MyArrayList<>();

        for (int i = 0; i < 11; i++) {
            list.add(i);
        }

        list.remove(2);
        list.set(0, 3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
