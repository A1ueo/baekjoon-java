package b4.b29725;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = new String[8];
        for (int i = 0; i < 8; i++) {
            strArr[i] = br.readLine();
        }
        int wScore = 0, bScore = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                switch (strArr[i].charAt(j)) {
                    case 'P':
                        wScore += 1;
                        break;
                    case 'N':
                    case 'B':
                        wScore += 3;
                        break;
                    case 'R':
                        wScore += 5;
                        break;
                    case 'Q':
                        wScore += 9;
                        break;
                    case 'p':
                        bScore += 1;
                        break;
                    case 'n':
                    case 'b':
                        bScore += 3;
                        break;
                    case 'r':
                        bScore += 5;
                        break;
                    case 'q':
                        bScore += 9;
                        break;
                }
            }
        }
        System.out.println(wScore - bScore);
    }
}
