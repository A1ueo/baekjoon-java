package s5.b1181;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> strList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String tmp = sc.nextLine();
            if (!strList.contains(tmp))
                strList.add(tmp);
        }
        sc.close();
        strList.sort(Comparator.naturalOrder());
        strList.sort((a, b) -> a.length() - b.length());
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
    }
}
