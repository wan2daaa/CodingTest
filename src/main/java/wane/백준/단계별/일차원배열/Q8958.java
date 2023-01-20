package wane.백준.단계별.일차원배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Q8958 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int plusO = 0;
        int sum = 0;
        List<Integer> sumList = new ArrayList<>();


        List<String> eachAnswer = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            eachAnswer = List.of(sc.next().split(""));

            for (String answer : eachAnswer) {
                if (answer.equals("O")) {
                    plusO++;
                    sum += plusO;
                }
                if (answer.equals("X")) {
                    plusO = 0;
                }
            }
            sumList.add(sum);
            plusO = 0;
            sum = 0;
        }

        for (Integer s : sumList) {
            System.out.println(s);
        }

    }

}
