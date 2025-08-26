package s4.b10866;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Deque<String> deq = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");

			switch (str[0]) {
				case "push_front":
					deq.offerFirst(str[1]);
					break;
				case "push_back":
					deq.offerLast(str[1]);
					break;
				case "pop_front":
					if (deq.isEmpty()) sb.append(-1 + "\n");
					else sb.append(deq.pollFirst() + "\n");
					break;
				case "pop_back":
					if (deq.isEmpty()) sb.append(-1 + "\n");
					else sb.append(deq.pollLast() + "\n");
					break;
				case "size":
					sb.append(deq.size() + "\n");
					break;
				case "empty":
					if (deq.isEmpty()) sb.append(1 + "\n");
					else sb.append(0 + "\n");
					break;
				case "front":
					if (deq.isEmpty()) sb.append(-1 + "\n");
					else sb.append(deq.peekFirst() + "\n");
					break;
				case "back":
					if (deq.isEmpty()) sb.append(-1 + "\n");
					else sb.append(deq.peekLast() + "\n");
					break;
			}
		}

		System.out.println(sb);
	}
}
