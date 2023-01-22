package wane.백준.단계별.문자열;

import java.util.Scanner;

public class Q2941 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        String[] splitWord = word.split("");

        int count = splitWord.length;

        for (int i = 0; i < splitWord.length-1; i++) {
            String findTwoWord = "";
            String findThreeWord = "";

                if (splitWord[i].equals("")) {
                    continue;
                }
            /**
             * Todo 문자열추출 : substring
             * Todo switch 는 equals ?, == ?
             */
            findTwoWord = word.substring(i, i+2);
                if (i < splitWord.length-2){
                    findThreeWord = word.substring(i, i+3);
                    if (findThreeWord.equals("dz=")) {
                        count-=2; splitWord[i] = ""; splitWord[i+1] = ""; splitWord[i+2] = ""; continue;
                    }
                }

                switch (findTwoWord) {
                    case "c=": case "c-": case "d-": case "lj":
                    case "nj": case "s=": case "z=":
                        count--; splitWord[i] = ""; splitWord[i+1] = ""; break;
                }

        }

        System.out.print(count);


    }

}
