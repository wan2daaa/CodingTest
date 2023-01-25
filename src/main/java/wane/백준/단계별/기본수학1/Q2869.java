package wane.백준.단계별.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());
        int dayDelete = up - down;
        int dayLeft = length % dayDelete;
        int dayPassed = length / dayDelete;

        if (dayLeft == 0) {
            System.out.print(dayPassed - (up / dayDelete) + 1);
        }else{
            System.out.print(dayPassed+1);
        }
    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int up = sc.nextInt();
//        int down = sc.nextInt();
//        int howLong = sc.nextInt();
//
//
//
//        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
//        System.out.println(resultCount(up, down, howLong));
//
//        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
//        long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
//
//    }
//
//    public static int resultCount(int up, int down, int howLong) {
////        for (int i = 1; ; i++) {
////            howLong -= up;
////            if (howLong <= 0) {
////                return i;
////            } else {
////                howLong += down;
////            }
////        }
//        int dayDelete = up - down;
//        int dayLeft = howLong % dayDelete;
//        int dayPassed = howLong / dayDelete;
//
//        if (dayLeft == 0) {
//            return dayPassed - (up/dayDelete) + 1;
//        }else{
//            return dayPassed+1;
//        }
//    }
}
