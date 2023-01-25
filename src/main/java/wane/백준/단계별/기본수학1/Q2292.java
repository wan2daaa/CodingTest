package wane.백준.단계별.기본수학1;

import java.util.Scanner;

public class Q2292 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int result = findBang();

        System.out.print(result);

    }

    public static int findBang() {
        int findNum = Integer.parseInt(sc.next());
        int compareFirstNum = 0;
        int compareLastNum = 1;

        for (int i = 1; ; i++) {
            if (compareFirstNum < findNum && compareLastNum >= findNum) {
                return i;
            } else {
                compareFirstNum = compareLastNum;
                compareLastNum = compareLastNum + i * 6;
            }

        }
    }

}
