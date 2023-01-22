package wane.백준.단계별.문자열;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Q1316 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            String word = sc.nextLine();
            String[] splitWord = word.split("");

            Set<String> setWord = new HashSet<>(List.of(splitWord));

            for (String eachWord : splitWord) {
                for (String eachSetWord : setWord) {
                    eachWord.equals(eachSetWord);
                }
            }

        }



    }

}
