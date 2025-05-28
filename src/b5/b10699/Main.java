package b5.b10699;
import java.time.LocalDateTime;



import java.time.format.DateTimeFormatter;







public class Main {



    public static void main(String[] args) {



        LocalDateTime Now = LocalDateTime.now();



        String dateTimeNow = Now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));



        



        System.out.printf(dateTimeNow);



    }



    



}



