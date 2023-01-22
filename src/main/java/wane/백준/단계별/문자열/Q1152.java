package wane.백준.단계별.문자열;

import java.util.Scanner;

public class Q1152 {

    /**
     * Todo isEmpty , == "", == null 차이
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] splitLine = line.split(" ");

        int length = splitLine.length;

        for (String s : splitLine) {
            if (s.isEmpty()) {
                length--;
            }
        }

        System.out.println(length);


    }

}
