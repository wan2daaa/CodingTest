package wane.백준.단계별.일차원배열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10807 {

    public static void main(String[] args) {

        int resultCount = 0;

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            numList.add(sc.nextInt());
        }

        int compareNum = sc.nextInt();

        for (Integer num : numList) {
            if (compareNum == num) {
                resultCount++;
            }
        }
        System.out.print(resultCount);
    }

}
