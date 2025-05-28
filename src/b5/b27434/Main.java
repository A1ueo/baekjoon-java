package b5.b27434;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buff = br.readLine();
        int n = Integer.parseInt(buff);
        ArrayList<Long> facto = new ArrayList<>();
        facto.add(1L);
        for (int i = 1; i <= n; i++) {
            int idx = facto.size();
            // list.add가 있어서 반복문 범위를 따로 받아야됨
            for (int j = idx - 1; j >= 0; j--) {
                // 곱하기를 앞에부터 해야 중복이 안됨
                facto.set(j, facto.get(j) * i);
                if (facto.get(j) >= 1000) {
                    // 넘치는 요소 바로 앞에 붙이기
                    // 앞에 이미 요소가 있으면 더하기
                    if (facto.size() > j + 1)
                        facto.set(j + 1, facto.get(j + 1) + facto.get(j) / 1000);
                    else
                        facto.add(j + 1, facto.get(j) / 1000);
                    facto.set(j, facto.get(j) % 1000);
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringBuilder sb = new StringBuilder();
        for (int i = 0; i < facto.size(); i++) {
            // 큰 자리수 부터 출력
            // 앞에 붙는 0이 없어지는 문제
            if (i == 0) {
                bw.write(String.valueOf(facto.get(facto.size() - 1 - i)));
                // sb.append(facto.get(facto.size() - 1 - i));
            } else {
                bw.write(String.format("%03d", facto.get(facto.size() - 1 - i)));
            }
        }
        bw.flush();
    }
}
