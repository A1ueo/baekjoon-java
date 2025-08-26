package s4.b2217;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		List<Integer> lst = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String buff = br.readLine();
			lst.add(Integer.valueOf(buff));
		}

		lst.sort(Comparator.naturalOrder());

		System.out.println(n * lst.get(0));
	}
}
