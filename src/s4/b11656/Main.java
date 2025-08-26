package s4.b11656;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		List<String> lst = new ArrayList<>();
		for (int i = 0; i < str.length(); i++){
			lst.add(str.substring(i));
		}

		lst.sort(Comparator.naturalOrder());

		StringBuilder sb = new StringBuilder();
		for (String s : lst)
			sb.append(s + "\n");
		System.out.println(sb);
	}
}
