package wane.백준.단계별.기본수학1;

import java.util.Scanner;

public class Q1712 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fixedCost = sc.nextInt();
        int variableCost = sc.nextInt();
        int notebookCount = sc.nextInt();

        int breakEvenPoint = findBreakEvenPoint(fixedCost, variableCost, notebookCount);
        System.out.print(breakEvenPoint);

    }

    public static int findBreakEvenPoint
        (int fixedCost, int variableCost, int notebookCount){
        int count = 0;
        int compareLeft = notebookCount - variableCost;
        for (; ; count++) {
            if (count < 0) {
                break;
            }
            if (compareLeft * count > fixedCost) {
                break;
            }
        }
        if (count < 0) {
            return -1;
        }else {
            return count;
        }

    }

}
