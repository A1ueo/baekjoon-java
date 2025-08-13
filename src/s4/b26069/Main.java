package s4.b26069;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Set<String> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			String[] tmp = br.readLine().split(" ");
			if ("ChongChong".equals(tmp[0])) {
				set.add(tmp[0]);
			} else if ("ChongChong".equals(tmp[1])) {
				set.add(tmp[1]);
			}

			if (set.contains(tmp[0])) {
				set.add(tmp[1]);
			} else if (set.contains(tmp[1])) {
				set.add(tmp[0]);
			}
		}

		System.out.println(set.size());
	}
}
