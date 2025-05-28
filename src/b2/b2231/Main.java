package b2.b2231;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // 분해합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buff = br.readLine();

        // int n = Integer.parseInt(buff);
        // int len = buff.length();
        // 자릿수, /= 연산에 쓰려면 문자열 길이보다 하나 작게
        // int figure = 1;
        // for(int i = 0; i < len - 1; i++){
        //     figure *= 10;
        // }
        // // 각 자리당 가능한 값 x - (2^n - 1)
        // int[] arr = new int[len];
        // int num = n;
        // for(int i = 0; num > 0; i++){
        //     arr[i] = num / figure;
        //     num %= figure;
        //     figure /= 10;
        // }
        // for(int i : arr){
        // }


        // 문자열로
        String[] strArr = buff.split("");

        int[] numArr = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++){
            numArr[i] = Integer.parseInt(strArr[i]);
        }



    }
}
