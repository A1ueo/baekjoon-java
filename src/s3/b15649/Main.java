package s3.b15649;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static StringBuilder sb;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] buff = br.readLine().split(" ");

		int n = Integer.parseInt(buff[0]);
		int m = Integer.parseInt(buff[1]);

		sb = new StringBuilder();

		method(1, n, m);

		System.out.println(sb);
	}

	static void method(int curr, int n, int m) {
		if (curr != n) {
			
		}
	}
}
