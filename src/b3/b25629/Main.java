package b3.b25629;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int i : arr) {
            if (i % 2 == 1)
                oddList.add(i);
            else
                evenList.add(i);
        }

        boolean flag = true;
        if (oddList.size() - evenList.size() < 0 || oddList.size() - evenList.size() > 1)
            flag = false;
        else {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    if (oddList.get((i + 2) / 2 - 1) % 2 == 0) {
                        flag = false;
                        break;
                    }
                } else {
                    if (evenList.get((i - 1) / 2) % 2 != 0) {
                        flag = false;
                        break;
                    }
                }
            }
        }

        if (flag)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
