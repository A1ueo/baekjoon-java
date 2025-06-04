package s5.b14916;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int five = n / 5;
        int two;
        while (five > 0 && (n - five * 5) % 2 != 0) {
            five--;
        }
        two = (n - five * 5) / 2;
        
        if ((n - five * 5) % 2 == 0)
            System.out.println(five + two);
        else System.out.println(-1);
    }
}
