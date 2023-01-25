package wane.백준.단계별.기본수학1;

import java.util.Scanner;

final class Find {
    public int findWhichLine; // 몇번째 라인에 있는지
    public int findWhereLine; //라인에 어디에 위치

    public int firstLineNum;

    public Find(int findWhichLine, int findWhereLine, int firstLineNum) {
        this.findWhichLine = findWhichLine;
        this.findWhereLine = findWhereLine;
        this.firstLineNum = firstLineNum;
    }
}

public class Q1193 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int findNum = sc.nextInt();

        Find forResult = findWhere(findNum);
        System.out.println(forResult.findWhichLine + " " + forResult.findWhereLine);

        String result = findResult(forResult);
        System.out.println(result);

    }

    public static Find findWhere(int findNum) {
        int compareFirstNum = 0;
        int compareLastNum = 1;

        for (int i = 1; ; i++) {
            if (compareFirstNum < findNum && compareLastNum >= findNum) {
                return new Find(i, findNum - compareFirstNum, compareFirstNum+1 );
            } else {
                compareFirstNum = compareLastNum;
                compareLastNum = compareLastNum + i + 1;
            }

        }
    }

    public static String findResult(Find find) {
        int bunja; int bunmo;
        if (find.findWhichLine % 2 == 0) {
            bunja = 1;
            bunmo = find.findWhichLine ;
            for (int i = 1; i < find.findWhereLine; i++) {
                bunja += 1;
                bunmo -=1;
            }
        }else {
            bunja = find.findWhichLine;
            bunmo = 1;
            for (int i = 1; i < find.findWhereLine ; i++) {
                bunja -= 1;
                bunmo += 1;
            }
        }
        return bunja + "/" + bunmo;
    }
}
