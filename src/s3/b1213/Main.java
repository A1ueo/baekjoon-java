package s3.b1213;




import java.io.BufferedReader;



import java.io.InputStreamReader;



import java.util.TreeMap;







public class Main {



    public static void main(String[] args) throws Exception {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        String str = br.readLine();







        TreeMap<Character, Integer> map = new TreeMap<>();



        for (int i = 0; i < str.length(); i++) {



            char target = str.charAt(i);



            if (map.containsKey(target)) {



                map.replace(target, map.get(target) + 1);



            } else {



                map.put(target, 1);



            }



        }







        int oddCount = 0;



        for (int value : map.values()) {



            if (value % 2 == 1) {



                oddCount++;



                if (oddCount > 1)



                    break;



            }



        }



        if (oddCount > 1) {



            System.out.println("I'm Sorry Hansoo");



            return;



        }







        StringBuilder sb = new StringBuilder();



        int count = 0;



        char oddChar = ' ';



        for (char c : map.keySet()) {



            for (int i = 0; i < map.get(c) / 2; i++) {



                sb.insert(count, c);



                sb.insert(sb.length() - 1 - count, c);



                count++;



            }



            if (map.get(c) % 2 == 1) {



                oddChar = c;



            }



        }







        if (oddChar != ' ') {



            sb.insert(sb.length() / 2, oddChar);



        }







        System.out.println(sb.toString());







    }



}



