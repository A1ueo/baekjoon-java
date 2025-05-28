package b5.b2744;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if (tmp >= 'A' && tmp <= 'Z') {
                sb.append((char) (tmp + 32));
            } else {
                sb.append((char) (tmp - 32));
            }
        }
        str = sb.toString();
        System.out.println(str);
    }
}
