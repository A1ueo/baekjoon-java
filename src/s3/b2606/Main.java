package s3.b2606;

import java.io.*;
import java.util.*;

public class Main {

	static Map<String, Set<String>> map;
	static Set<String> set;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		map = new HashMap<>();
		for (int i = 1; i <= n; i++)
			map.put(String.valueOf(i), new HashSet<>());

		for (int i = 0; i < m; i++) {
			String[] tmp = br.readLine().split(" ");

			map.get(tmp[0]).add(tmp[1]);
			map.get(tmp[1]).add(tmp[0]);
		}

		set = new LinkedHashSet<>();
		set.add("1");
		method("1");

		System.out.println(set.size() - 1);
	}

	static void method(String curr) {
		for (String s : map.get(curr)) {
			set.add(s);
			for (String c : set)
				map.get(s).remove(c);
			method(s);
		}
	}
}
