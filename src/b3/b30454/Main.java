package b3.b30454;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        sc.nextLine();
        ArrayList<String> strArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String buff = sc.nextLine();
            strArr.add(buff);
        }
        ArrayList<Integer> intArr = new ArrayList<>();
        int maxStripes = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < strArr.get(0).length(); j++) {
                if (strArr.get(i).charAt(j) == '1'
                        && (j == 0 || strArr.get(i).charAt(j - 1) != '1')) {
                    count++;
                }
            }
            intArr.add(count);
            if (count > maxStripes) {
                maxStripes = count;
            }
        }
        int maxCount = 0;
        for (int i : intArr) {
            if (i == maxStripes) {
                maxCount++;
            }
        }
        System.out.printf("%d %d", maxStripes, maxCount);
        sc.close();
    }

}
