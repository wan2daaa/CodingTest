package wane.백준.단계별.함수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1065 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultCount = 0;

        int num = sc.nextInt();

        int findResultNum = 1;

        while (true) {
            if (findResultNum < 100) {
                resultCount++;
            } else if (findResultNum >= 100 && findResultNum <= 999) {

                int hundredDigit = findResultNum / 100;
                int tenDigit = findResultNum / 10 % 10;
                int oneDigit = findResultNum % 10;

                if (hundredDigit - tenDigit == tenDigit - oneDigit) {
                    resultCount++;
                }
            }
            if (findResultNum == num) {
                    break;
                }

            findResultNum++;
        }

        System.out.println(resultCount);

    }
}
