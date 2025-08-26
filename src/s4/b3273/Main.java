package s4.b3273;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] buff = br.readLine().split(" ");

		int x = Integer.parseInt(br.readLine());

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(Integer.valueOf(buff[i]));
		}

		var it = set.iterator();
		int count = 0;
		while (it.hasNext()) {
			int a = it.next();
			if (set.contains(x - a)) {
				count++;
				it.remove();
			}
		}

		System.out.println(count);
	}
}
