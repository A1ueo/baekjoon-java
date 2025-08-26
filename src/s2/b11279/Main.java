package s2.b11279;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> que = new PriorityQueue<>(Comparator.naturalOrder());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(br.readLine());
			if (tmp == 0) {
				if (que.isEmpty()) sb.append(0 + "\n");
				else sb.append(que.poll() + "\n");
			} else {
				que.offer(tmp);
			}
		}

		System.out.println(sb);
	}
}
