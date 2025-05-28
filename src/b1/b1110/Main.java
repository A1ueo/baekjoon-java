package b1.b1110;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int curr = first, next = 0, count = 1;

        while (true) {
            next = (curr / 10 + curr % 10) % 10 + curr % 10 * 10;
            if (next == first) {
                break;
            }
            else {
                curr = next;
            }
            count++;
        }
        System.out.println(count);
    }

}
