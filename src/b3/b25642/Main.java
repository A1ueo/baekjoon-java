package b3.b25642;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yt = sc.nextInt();
        int yj = sc.nextInt();

        boolean attack = true;
        while (yt < 5 && yj < 5) {
            if (attack) {
                yj += yt;
            } else {
                yt += yj;
            }
            attack = !attack;
        }
        if (yt < 5) {
            System.out.println("yt");
        } else {
            System.out.println("yj");
        }
        sc.close();
    }
}
