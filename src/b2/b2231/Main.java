package b2.b2231;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // 분해합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buff = br.readLine();

        int n = Integer.parseInt(buff);
        int len = buff.length();
        int figure = 1;
        // 자릿수, /= 연산에 쓰려면 문자열 길이보다 하나 작게
        for (int i = 0; i < len - 1; i++) {
            figure *= 10;
        }

        // 각 자리당 가능한 수 2^n개
        int[] arr = new int[len];
        int num = n;



        // for(int i = 0; i < len; i++){
        // int tmp = num / figure;
        // while((num - tmp) / figure == tmp) {
        // if((num - tmp) / figure == tmp) {
        // num -= tmp;
        // arr[i] = tmp;
        // num %= figure;
        // figure /= 10;
        // } else {
        // tmp--;
        // }
        // }
        // }
        // for(int i : arr)
        // System.out.print(i);


        // 문자열로
        // String[] strArr = buff.split("");
        // int num = Integer.parseInt(buff);

        // int[] numArr = new int[strArr.length];
        // for(int i = 0; i < strArr.length; i++){
        // numArr[i] = Integer.parseInt(strArr[i]);
        // }



    }
}
