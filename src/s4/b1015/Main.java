package s4.b1015;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] buff = br.readLine().split(" ");

		int[] origin = Arrays.stream(buff).mapToInt(Integer::parseInt).toArray();

		int[] copy = null;
		System.arraycopy(origin, 0, copy, 0, n);

		Arrays.sort(copy);
		for (int i = 0; i < n; i++) {
			
		}


		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {

		}
	}
}

class Pair {
	int first;
	int second;

    public Pair(int first, int second) {
		this.first = first;
		this.second = second;
    }
}
