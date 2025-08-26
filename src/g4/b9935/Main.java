package g4.b9935;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String word = br.readLine();
		String bomb = br.readLine();

		int size = 0;
		int preSize = -1;
		while (size != preSize) {
			preSize = word.length();
			word = word.replaceAll(bomb, "");
			size = word.length();
		}

		if (word.equals("")) System.out.println("FRULA");
		else System.out.println(word);
	}
}
