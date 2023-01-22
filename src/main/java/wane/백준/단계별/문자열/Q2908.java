package wane.백준.단계별.문자열;

import java.util.Scanner;

public class Q2908 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int firNumber = changeNum(sc.nextInt());
        int secNumber = changeNum(sc.nextInt());

        if (firNumber > secNumber) {
            System.out.print(firNumber);
        } else {
            System.out.print(secNumber);
        }

    }

    static int changeNum(int number) {
        int hundred = number / 100;
        int ten = number / 10 % 10;
        int one = number % 100 % 10;

        return 100 * one + 10 * ten + hundred;
    }
}
