package wane.백준.단계별.조건문;

import java.util.Scanner;

public class Q1110 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        String givenNum = num;
        if (num.length() == 1){ num = "0" + num;}
        int result = 0;

        while (true) {

                int firstNumIndex0 = Integer.parseInt(String.valueOf(givenNum.charAt(0)));
                String firstNumIndex0Str = String.valueOf(givenNum.charAt(0));

                if(givenNum.length() == 2) {
                    int firstNumIndex1 = Integer.parseInt(String.valueOf(givenNum.charAt(1)));

                    String findNum = String.valueOf(firstNumIndex0 + firstNumIndex1);

                        if (findNum.length() == 1){
                                givenNum = givenNum.charAt(1) + findNum;
                        }else {
                                givenNum = givenNum.charAt(1) + String.valueOf(findNum.charAt(1));
                        }
                }
                else if (givenNum.length() == 1) {
                    givenNum = givenNum + givenNum;
                }

            result ++;

            if (givenNum.equals(num)) {
                System.out.println(result);
                break;
            }

        }
    }

}
