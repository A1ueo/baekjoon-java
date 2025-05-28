package b3.b29722;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] now = br.readLine().split("-");
        int day = Integer.parseInt(br.readLine());

        int nowDay = Integer.parseInt(now[2]);
        int nowMonth = Integer.parseInt(now[1]);
        int nowYear = Integer.parseInt(now[0]);

        day += nowDay;
        int month = nowMonth;
        int year = nowYear;

        if (day > 30) {
            month += (day - 1) / 30;
            day = (day - 1) % 30 + 1;
        }
        if (month > 12) {
            year += (month - 1) / 12;
            month = (month - 1) % 12 + 1;
        }

        System.out.printf("%d-%02d-%02d%n", year, month, day);
    }
}
