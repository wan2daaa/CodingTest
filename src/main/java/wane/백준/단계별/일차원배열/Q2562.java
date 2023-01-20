package wane.백준.단계별.일차원배열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2562 {

    public static void main(String[] args) {
        int count = 9;
        int max = 0;
        int numCount = 0;
        int maxNumCount = 0;

        Scanner sc = new Scanner(System.in);

        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int compareNum = sc.nextInt();
            numCount++;

            if (max < compareNum) {
                max = compareNum;
                maxNumCount = numCount;
            }

        }

        System.out.println(max);
        System.out.println(maxNumCount);
    }
}
