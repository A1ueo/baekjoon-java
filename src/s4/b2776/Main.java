package s4.b2776;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {

			int n = Integer.parseInt(br.readLine());
			String[] buff = br.readLine().split(" ");
			Set<String> set = new HashSet<>();
			for (int j = 0; j < n; j++) {
				set.add(buff[j]);
			}
		
			int m = Integer.parseInt(br.readLine());
			buff = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				if (set.contains(buff[j])) sb.append(1 + "\n");
				else sb.append(0 + "\n");
			}
		}

		System.out.println(sb);
	}
}
