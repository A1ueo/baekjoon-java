package b3.b10162;




import java.util.Scanner;







public class Main {



    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);



        int n = sc.nextInt();



        int a = n / (60 * 5);



        n %= 60 * 5;



        int b = n / 60;



        n %= 60;



        int c = n / 10;



        if (n % 10 != 0)



            System.out.println(-1);



        else



            System.out.printf("%d %d %d", a, b, c);



    }



}



