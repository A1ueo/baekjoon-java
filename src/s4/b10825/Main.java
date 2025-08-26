package s4.b10825;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		List<Student> lst = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String[] buff = br.readLine().split(" ");
			Student std = new Student();
			std.name = buff[0];
			std.kor = Integer.parseInt(buff[1]);
			std.eng = Integer.parseInt(buff[2]);
			std.math = Integer.parseInt(buff[3]);

			lst.add(std);
		}

		lst.sort((a, b) -> {
			if (a.kor != b.kor) return b.kor - a.kor;
			else if (a.eng != b.eng) return a.eng - b.eng;
			else if (a.math != b.math) return b.math - a.math;
			else return Objects.compare(a.name, b.name, Comparator.naturalOrder());
		});

		StringBuilder sb = new StringBuilder();
		for (Student s : lst) {
			sb.append(s.name + "\n");
		}

		System.out.println(sb);
	}
}

class Student {
	String name;
	int kor;
	int eng;
	int math;
}
