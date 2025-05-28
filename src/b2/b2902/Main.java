package b2.b2902;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split("-");

        StringBuilder answer = new StringBuilder();
        for (String st : strArr) {
            answer.append(st.charAt(0));
        }
        System.out.println(answer.toString());
        sc.close();
    }
}
