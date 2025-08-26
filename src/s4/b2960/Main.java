package s4.b2960;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] buff = br.readLine().split(" ");
		int n = Integer.parseInt(buff[0]);
		int k = Integer.parseInt(buff[1]) - 1;

		List<Integer> lst = new LinkedList<>();
		for (int i = 2; i <= n; i++) {
			lst.add(i);
		}

		for (int i = 1; i < k; i++) {
			
		}
	}
}
