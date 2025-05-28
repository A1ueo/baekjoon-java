package b1.b1032;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String tmp = sc.nextLine();
            arr.add(tmp);
        }
        char[] answer = arr.get(0).toCharArray();
        for (int i = 0; i < arr.get(0).length(); i++) {
            for (int j = 1; j < arr.size(); j++) {
                if (answer[i] != arr.get(j).charAt(i)) {
                    answer[i] = '?';
                }
                if (answer[i] == '?') {
                    break;
                }
            }
        }
        System.out.println(answer);
        sc.close();
    }

}
