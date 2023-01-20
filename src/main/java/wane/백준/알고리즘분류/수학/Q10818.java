package wane.백준.알고리즘분류.수학;

import java.util.Scanner;

public class Q10818 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int num = sc.nextInt();
        int min = num;
        int max = num;
        for (int i = 0; i < count-1 ; i++) {
            num = sc.nextInt();
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
        }
        System.out.print(min + " " + max);
    }
}
