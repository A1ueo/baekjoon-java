package s4.b1302;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String buff = br.readLine();
			map.put(buff, map.getOrDefault(buff, 0) + 1);
		}

		int max = 0;
		String book = null;
		for (String s : map.keySet()) {
			if (map.get(s) > max) {
				max = map.get(s);
				book = s;
			} else if (map.get(s) == max) {
				if (s.compareTo(book) < 0) {
					book = s;
				}
			}
		}

		System.out.println(book);
	}
}
