package s2.b1260;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class Main {
	
	static Map<String, Set<String>> map;
	static Set<String> set;
	static StringBuilder sb;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] buff = br.readLine().split(" ");
		int n = Integer.parseInt(buff[0]);
		int m = Integer.parseInt(buff[1]);
		int v = Integer.parseInt(buff[2]);

		map = new HashMap<String, Set<String>>(n);
		for (int i = 1; i <= n; i++)
			map.put(String.valueOf(i), new TreeSet<>());

		for (int i = 0; i < m; i++) {
			buff = br.readLine().split(" ");

			map.get(buff[0]).add(buff[1]);
			map.get(buff[1]).add(buff[0]);
		}

		set = new HashSet<String>();
		set.add(String.valueOf(v));
		sb = new StringBuilder();
		sb.append(v + "\n");
		method(String.valueOf(v));

		System.out.println(sb);
	}

	static void method(String curr) {
		for (String s : map.get(curr)) {
			sb.append(s + "\n");
			set.add(s);
			for (String c : set) {
				map.get(s).remove(c);
			}
			if (!set.contains(s)) {
				method(s);
			}
		}
	}
}
