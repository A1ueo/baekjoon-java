package b1.b2693;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			List<Integer> lst = new ArrayList<>();
			String[] buff = br.readLine().split(" ");
			for (String s : buff) {
				lst.add(Integer.valueOf(s));
			}
			lst.sort(Comparator.reverseOrder());
			sb.append(lst.get(2) + "\n");
		}

		System.out.println(sb);
	}
}
