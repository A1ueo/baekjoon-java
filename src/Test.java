
import java.util.ArrayDeque;


public class Test {
    public static void main(String[] args) {
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        deq.offer(1);
        deq.offer(2);
        deq.offer(3);
        System.out.println(deq.getFirst());
    }
}
