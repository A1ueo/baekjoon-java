package g5.b7576;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] buff = br.readLine().split(" ");

		int n = Integer.parseInt(buff[0]);
		int m = Integer.parseInt(buff[1]);

		String[][] arr = new String[m][n];
		Queue<Pair> que = new ArrayDeque<>();	// 1이 들어있는 좌표
		for (int i = 0; i < m; i++) {
			arr[i] = br.readLine().split(" ");

			for (int j = 0; j < n; j++) {
				if (Objects.equals(arr[i][j], "1")) {
					que.add(new Pair(j, i, 0));
				}
			}
		}

		int result = 0;
		while (!que.isEmpty()) {
			Pair pair = que.poll();
			int x = pair.x;
			int y = pair.y;
			int step = pair.step;

			if (x + 1 < n) {	// 범위 내의 좌표면 1로 바꾸고 큐에 추가
				if (Objects.equals(arr[y][x + 1], "0")) {
					arr[y][x + 1] = "1";
					que.add(new Pair(x + 1, y, step + 1));
				}
			}
			if (y + 1 < m) {
				if (Objects.equals(arr[y + 1][x], "0")) {
					arr[y + 1][x] = "1";
					que.add(new Pair(x, y + 1, step + 1));
				}
			}
			if (x - 1 >= 0) {
				if (Objects.equals(arr[y][x - 1], "0")) {
					arr[y][x - 1] = "1";
					que.add(new Pair(x - 1, y, step + 1));
				}
			}
			if (y - 1 >= 0) {
				if (Objects.equals(arr[y - 1][x], "0")) {
					arr[y - 1][x] = "1";
					que.add(new Pair(x, y - 1, step + 1));
				}
			}

			result = step;	// 현재 단계를 저장
		}

		for (String[] a : arr) {
			for (String s : a) {
				if (Objects.equals(s, "0")) {	// 0이 남아있으면 -1을 출력
					System.out.println(-1);
					return;
				}
			}
		}
		
		System.out.println(result);
	}
}

class Pair{
	int x;
	int y;
	int step;

    public Pair(int x, int y, int step) {
		this.x = x;
		this.y = y;
		this.step = step;
    }
}
