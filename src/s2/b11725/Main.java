package s2.b11725;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Set<String> set = null;
		int count = 0;
		for (int i = 0; i < n; i++) {
			String tmp = br.readLine();

			if("ENTER".equals(tmp)) {
				set = new HashSet<>();
			} else if (tmp != null && !set.contains(tmp)) {
				set.add(tmp);
				count++;
			}
		}

		System.out.println(count);
	}
}
