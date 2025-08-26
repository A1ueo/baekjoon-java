package s3.b2606;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

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

		System.out.println(set.size());
	}

	static void method(String curr) {
		var it = map.get(curr).iterator();
		while (it.hasNext()) {
			String s = it.next();
			set.add(s);
			it.remove();
			method(s);
		}
	}
}
