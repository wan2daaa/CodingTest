package wane.백준.단계별.일차원배열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4344 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        List<Double> resultList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int average = 0;
            int overAvg = 0;
            int eachCount = sc.nextInt();
            List<Integer> scoreList = new ArrayList<>();

            for (int j = 0; j < eachCount; j++) {
                int score = sc.nextInt();
                scoreList.add(score);
                average += score;
            }
            average /= eachCount;

            for (Integer score : scoreList) {
                if (score > average) {
                    overAvg++;
                }
            }

            resultList.add((double) overAvg /(double) eachCount * 100);
        }

        for (Double result : resultList) {
            System.out.printf("%.3f", result);
            System.out.println("%");
        }
    }
}
