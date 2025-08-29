package s2.b1260;

import java.io.*;
import java.util.*;


public class Main {
	
	static HashMap<String, Queue<Integer>> map;
	static StringBuilder sbDfs;
	static StringBuilder sbBfs;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] buff = br.readLine().split(" ");
		int n = Integer.parseInt(buff[0]);
		int m = Integer.parseInt(buff[1]);
		String v = buff[2];

		map = new HashMap<String, Queue<Integer>>(n);
		for (int i = 1; i <= n; i++)
			map.put(String.valueOf(i), new PriorityQueue<>(Comparator.naturalOrder()));

		for (int i = 0; i < m; i++) {
			buff = br.readLine().split(" ");

			map.get(buff[0]).add(Integer.valueOf(buff[1]));
			map.get(buff[1]).add(Integer.valueOf(buff[0]));
		}

		sbDfs = new StringBuilder();
		sbDfs.append(v);
		dfs(v);
		System.out.println(sbDfs);

		// sbBfs = new StringBuilder();
		// sbBfs.append(v);
		// map.get(v).add(-2);
		// bfs(v);
		// System.out.println(sbBfs);
	}

	static void dfs(String curr) {
		map.get(curr).add("-1");
		for (String s : map.get(curr)) {
			if (!s.equals("-1") && !map.get(s).contains("-1")) {

				sbDfs.append(" " + s);
				dfs(s);
			}
		}
	}

	// static void bfs(String curr) {
	// 	// map.get(curr).add("-2");
	// 	Queue<String> que = new ArrayDeque<>();
	// 	for (String s : map.get(curr)) {
	// 		if (!s.equals("-1") &&
	// 				!s.equals("-2") && !map.get(s).contains("-2")) {
	// 			sbBfs.append(" " + s);
	// 			map.get(s).add("-2");
	// 			que.add(s);
	// 		}
	// 	}
		
	// 	for (String s : que) {
	// 		bfs(s);
	// 	}
	// }
}
