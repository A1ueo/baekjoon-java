package s4.b1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buff = br.readLine();
        int n = Integer.parseInt(buff.split(" ")[0]);
        int m = Integer.parseInt(buff.split(" ")[1]);

        ArrayList<String> notHeardList = new ArrayList<>();
        HashSet<String> notSeenList = new HashSet<>();
        for (int i = 0; i < n + m; i++) {
            buff = br.readLine();
            if (buff.isEmpty())
                break;
            if (i < n) {
                notHeardList.add(buff);
            }
            else {
                notSeenList.add(buff);
            }
        }
        ArrayList<String> commonList = new ArrayList<>();
        notHeardList.sort(Comparator.naturalOrder());
        for (int i = 0; i < notHeardList.size(); i++) {
            if (notSeenList.contains(notHeardList.get(i))) {
                commonList.add(notHeardList.get(i));
            }
        }
        System.out.println(commonList.size());
        for (int i = 0; i < commonList.size(); i++) {
            System.out.println(commonList.get(i));
        }
    }
}
