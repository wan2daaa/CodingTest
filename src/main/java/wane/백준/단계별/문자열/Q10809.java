package wane.백준.단계별.문자열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10809 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Integer> resultArr = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            resultArr.add(-1);
        }

        for (int i = 0; i < input.length(); i++) {
            int idx = input.charAt(i)-97;

            if (resultArr.get(idx) == -1) {
                resultArr.set(idx, i);
            }

        }
        for (Integer result : resultArr) {
            System.out.print(result + " ");
        }
    }

}
