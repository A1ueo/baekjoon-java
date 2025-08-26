package s4.b14425;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmp = br.readLine().split(" ");
		int n = Integer.parseInt(tmp[0]);
		int m = Integer.parseInt(tmp[1]);

		Set<String> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			String buff = br.readLine();
			set.add(buff);
		}

		int count = 0;
		for (int i = 0; i < m; i++) {
			String buff = br.readLine();
			if (set.contains(buff)) count++;
		}

		System.out.println(count);
	}
}
