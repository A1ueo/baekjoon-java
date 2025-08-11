package s1.b11660;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] buff = br.readLine().split(" ");
		int n = Integer.parseInt(buff[0]);
		int m = Integer.parseInt(buff[1]);

		int[][] arr = new int[n][n];
		for (int y = 0; y < n; y++) {
			buff = br.readLine().split(" ");
			for (int x = 0; x < n; x++) {
				arr[y][x] = Integer.parseInt(buff[x]);
			}
		}

		int[] ans = new int[m];
		int[] preIdx = null;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			buff = br.readLine().split(" ");
			int[] idx = new int[4];
			for (int j = 0; j < 4; j++) {
				idx[j] = j > 1 ? Integer.parseInt(buff[j]) : Integer.parseInt(buff[j]) - 1;
			}

			if (i == 0) {
				for (int y = idx[1]; y < idx[3]; y++) {
					for (int x = idx[0]; x < idx[2]; x++) {
						ans[i] += arr[y][x];
					}
				}
			} else {
				if (preIdx[0] < idx[0]) {

				} else if (idx[0] < preIdx[0]) {

				}

				if (preIdx[2] < idx[2]) {

				} else if (idx[2] < preIdx[2]) {

				}

			}

			preIdx = idx;

			sb.append(ans[i]).append('\n');
		}

		System.out.println(sb);
	}

	static int calcY(int[] idx, int[] preIdx) {
		int sum = 0;

		if (idx[1] < preIdx[1]) {

		}
			

		return 0;
	}
}
