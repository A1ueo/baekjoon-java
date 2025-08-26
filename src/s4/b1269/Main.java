package s4.b1269;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] buff = br.readLine().split(" ");

		int a = Integer.parseInt(buff[0]);
		int b = Integer.parseInt(buff[1]);

		Set<String> setA = new HashSet<>();
		buff = br.readLine().split(" ");
		for (int i = 0; i < a; i++) {
			setA.add(buff[i]);
		}

		Set<String> tmp = new HashSet<>(setA);

		Set<String> setB = new HashSet<>();
		buff = br.readLine().split(" ");
		for (int i = 0; i < b; i++) {
			setB.add(buff[i]);
			setA.remove(buff[i]);
		}

		for (String s : tmp) {
			setB.remove(s);
		}


		System.out.println(setA.size() + setB.size());
	}
}
