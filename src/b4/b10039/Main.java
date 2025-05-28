package b4.b10039;




import java.util.Scanner;







public class Main {



    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);



        int sum = 0;



        for (int i = 0; i < 5; i++) {



            int tmp = sc.nextInt();



            tmp = tmp < 40 ? 40 : tmp;



            sum += tmp;



        }



        sc.close();



        System.out.println(sum / 5);







    }



}



