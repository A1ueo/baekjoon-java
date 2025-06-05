package s3.b1463;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int count = 0;
        while (x != 1) {
            if (x != 1 && x % 3 == 0) {
                x /= 3;
            } else if (x != 1 && x % 2 == 0) {
                x /= 2;
            } else {
                x--;
            }
            count++;
        }

        System.out.println(count);
    }
}
