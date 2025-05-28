package b1.b1259;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<Boolean> answer = new ArrayList<>();
        while (true) {
            String tmp = sc.nextLine();
            if (tmp.equals("0"))
                break;
            arr.add(tmp);
        }

        for (String i : arr) {
            boolean check = true;
            for (int j = 0; j < i.length() / 2; j++) {
                if (i.charAt(j) != i.charAt(i.length() - 1 - j)) {
                    check = false;
                }
            }
            answer.add(check);
        }
        for (Boolean i : answer) {
            if (i) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
    }
}
