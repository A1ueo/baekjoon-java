package b4.b1264;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strArr = new ArrayList<>();
        while (true) {
            String tmp = sc.nextLine();
            if (tmp.equals("#"))
                break;
            strArr.add(tmp);
        }
        sc.close();
        ArrayList<Character> vowelArr = new ArrayList<>(Arrays.asList(
                'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'));
        int[] count = new int[strArr.size()];
        Arrays.fill(count, 0);
        for (int i = 0; i < strArr.size(); i++) {
            for (int j = 0; j < strArr.get(i).length(); j++) {
                if (vowelArr.contains(strArr.get(i).charAt(j))) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
    }
}
