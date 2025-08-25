package s2.b11725;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		Map<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < n - 1; i++) {
			String[] tmp = br.readLine().split(" ");
			if (!map.containsKey(tmp[0])) {
				map.put(tmp[0], new LinkedList<String>());
			}
			if (!map.containsKey(tmp[1])) {
				map.put(tmp[1], new LinkedList<String>());
			}

			map.get(tmp[0]).add(tmp[1]);
			map.get(tmp[1]).add(tmp[0]);
		}
		
		System.out.println(map);
		Map<String, String> result = new HashMap<>();
		method(map, "1", result);
		System.out.println(result);
	}

	static void method(Map<String, List<String>> map, String parent, 
			Map<String, String> result) {
		for (String s : map.get(parent)) {
			if (s != null && s.equals(parent)) result.put(s, parent);
			else method(map, s, result);
		}
	}
}
