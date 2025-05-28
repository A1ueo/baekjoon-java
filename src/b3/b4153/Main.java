package b3.b4153;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean Calc(Integer[] arr) {
        boolean result = false;
        if (Math.pow(arr[2], 2) == Math.pow(arr[0], 2) + Math.pow(arr[1], 2))
            result = true;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer[]> arr = new ArrayList<>();

        while (true) {
            Integer[] tmp = new Integer[3];
            for (int i = 0; i < 3; i++) {
                tmp[i] = sc.nextInt();
            }
            if (tmp[0] == 0 && tmp[1] == 0 && tmp[2] == 0)
                break;
            Arrays.sort(tmp);
            arr.add(tmp);
        }
        for (Integer[] i : arr) {
            if (Calc(i))
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}
