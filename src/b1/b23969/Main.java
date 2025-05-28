package b1.b23969;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        // ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            // list.add(tmp);
            arr[i] = tmp;
        }
        sc.close();
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        int count = 0;
        for (int i = 0; count < k; i++) {
            int j = i % (n - 1);
            // if (list.get(j) > list.get(j + 1)) {
            // int tmp = list.get(j);
            // list.set(j, list.get(j + 1));
            // list.set(j + 1, tmp);
            // count++;
            // }
            if (arr[j] > arr[j + 1]) {
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
                count++;
            }
            // TODO: 더이상 정렬이 없으면 루프 탈출
            if (Arrays.equals(arr, sorted))
                break;
        }

        if (count < k) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < n; i++) {
                System.out.printf("%d ", arr[i]);
            }
        }
    }
}
