
<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.InputStreamReader;
=======
>>>>>>> 338d0dbd3bfa70366e9d4df464b7acd77129d226




public class Main {

<<<<<<< HEAD
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "cp949"));
        String buff = br.readLine();
=======
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        MyList<Integer> list = new MyArrayList<>();
>>>>>>> 338d0dbd3bfa70366e9d4df464b7acd77129d226

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
