package b1.b1145;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int tmp = sc.nextInt();
            arr.add(tmp);
        }
        arr.sort(Comparator.naturalOrder());
        
        int answer = 0, multiplyer = arr.get(2);

        while(true)
        { 
            int count = 0, value = arr.get(0) * multiplyer;
            for(int i = 1; i < arr.size(); i++){
                if(value % arr.get(i) == 0){
                    count++;
                }
            }
            if(count >= 2){
                answer = arr.get(0) * multiplyer;
                break;
            }
            else{
                multiplyer++;
            }
        }
        System.out.println(answer);
    }
    
}
