package wane.백준.단계별.문자열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2675 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int repeatCount = Integer.parseInt(sc.nextLine());

        List<String> answer = new ArrayList<>();

        for (int i = 0; i < repeatCount; i++) {
            String eachAnswer = "";

            String line = sc.nextLine();

            String[] twoVariable = line.split(" ");

            int count = Integer.parseInt(twoVariable[0]);
            String[] split = twoVariable[1].split("");

            for (String s : split) {
                for (int j = 0; j < count; j++) {
                    eachAnswer += s;
                }
            }
            answer.add(eachAnswer);

        }

        for (String s : answer) {
            System.out.println(s);
        }


    }
}
