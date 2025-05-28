package s4.b1018;
import java.io.BufferedReader;



import java.io.InputStreamReader;



import java.util.ArrayList;







public class Main {



    public static void main(String[] args) throws Exception {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        String[] input = br.readLine().split(" ");



        int row = Integer.parseInt(input[0]);



        int col = Integer.parseInt(input[1]);







        ArrayList<String> list = new ArrayList<>();



        for (int i = 0; i < row; i++) {



            String tmp = br.readLine();



            list.add(tmp);



        }







        // int[][] countArr = new int[row][col - 8 + 1];



        int[][] whiteFirstArr = new int[row][col - 8 + 1];



        int[][] blackFirstArr = new int[row][col - 8 + 1];



        for (int i = 0; i < list.size(); i++) {



            // 가로 8칸씩 카운트 시작점



            for (int j = 0; j < list.get(i).length() - 8 + 1; j++) {



                int whiteFirstCount = 0;



                int blackFirstCount = 0;



                // 가로 8칸 안에서 카운트



                for (int k = j; k < j + 8; k++) {



                    if ((i + k) % 2 == 0) {



                        if (list.get(i).charAt(k) == 'W') {



                            blackFirstCount++;



                        } else {



                            whiteFirstCount++;



                        }



                    } else {



                        if (list.get(i).charAt(k) == 'B') {



                            blackFirstCount++;



                        } else {



                            whiteFirstCount++;



                        }



                    }



                }



                // 최소 비교를 여기서 하면 안됨



                // countArr[i][j] = Math.min(whiteFirstCount, blackFirstCount);



                whiteFirstArr[i][j] = whiteFirstCount;



                blackFirstArr[i][j] = blackFirstCount;



            }



        }







        // for (int i = 0; i < countArr.length; i++) {



        // for (int j = 0; j < countArr[i].length; j++) {



        // System.out.print(countArr[i][j] + " ");



        // }



        // System.out.println();



        // }







        // for (int i = 0; i < whiteFirstArr.length; i++) {



        // for (int j = 0; j < whiteFirstArr[i].length; j++) {



        // System.out.print(whiteFirstArr[i][j] + " ");



        // }



        // System.out.println();



        // }



        // System.out.println();



        // for (int i = 0; i < blackFirstArr.length; i++) {



        // for (int j = 0; j < blackFirstArr[i].length; j++) {



        // System.out.print(blackFirstArr[i][j] + " ");



        // }



        // System.out.println();



        // }







        int min = Integer.MAX_VALUE;



        // 구간별 카운트 합치기



        for (int i = 0; i < list.size() - 8 + 1; i++) {



            for (int j = 0; j < list.get(i).length() - 8 + 1; j++) {



                // int count = 0;



                int whiteFirstCount = 0;



                int blackFirstCount = 0;



                // 세로 범위 안에서 더하기



                for (int k = i; k < i + 8; k++) {



                    // count += countArr[k][j];



                    whiteFirstCount += whiteFirstArr[k][j];



                    blackFirstCount += blackFirstArr[k][j];



                }



                int count = Math.min(whiteFirstCount, blackFirstCount);



                min = Math.min(min, count);



            }



        }







        System.out.println(min);



    }



}



