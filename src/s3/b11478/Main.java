package s3.b11478;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		Set<String> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length() - i; j++) {
				String tmp = str.substring(j, j + i + 1);
				set.add(tmp);
			}
		}

		System.out.println(set.size());
	}
}
