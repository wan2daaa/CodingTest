package wane.백준.단계별.문자열;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Q1157 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] eachCharCount = new int[26];
        int maxNum = 0;
        char index = 0;

        String word = sc.nextLine();
        String[] split = word.split("");

        for (int i = 0; i < word.length(); i++) {
            Character wordChar = word.charAt(i);
            int wordCharIndex = Character.toLowerCase(wordChar);
            eachCharCount[wordCharIndex-97]++;
        }

        for (int i = 0; i < eachCharCount.length; i++) {
            if (maxNum < eachCharCount[i]) {
                maxNum = eachCharCount[i];
                index = (char) (i + 65);
            } else if (maxNum == eachCharCount[i]) {
                index = '?';
            }
        }

        System.out.println(index);
    }
}
