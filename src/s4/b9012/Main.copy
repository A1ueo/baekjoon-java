package s4.b9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<String> strList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            strList.add(str);
        }

        ArrayList<Boolean> checkList = new ArrayList<>();
        for (int i = 0; i < strList.size(); i++) {
            int count = 0;
            boolean check = true;
            for (int j = 0; j < strList.get(i).length(); j++) {
                if (strList.get(i).charAt(j) == '(') {
                    count++;
                } else if (strList.get(i).charAt(j) == ')') {
                    if (count > 0) {
                        count--;
                    } else {
                        check = false;
                    }
                }
            }
            if (count != 0) {
                check = false;
            }
            checkList.add(check);
        }

        for (int i = 0; i < strList.size(); i++) {
            if (checkList.get(i)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
