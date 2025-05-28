package b5.b28691;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        HashMap<String, String> club = new HashMap<>() {
            {
                put("M", "MatKor");
                put("W", "WiCys");
                put("C", "CyKor");
                put("A", "AlKor");
                put("$", "$clear");
            }
        };
        System.out.println(club.get(c));
        sc.close();
    }
}
