package wane.백준.단계별.입출력과사칙연산;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q3003 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String pieces = sc.nextLine();
        List<String> piece = List.of(pieces.split("\\s+"));

        List<Integer> pieceEachHowNeed = Arrays.asList(1, 1, 2, 2, 2, 8);

        List<String> answer = new ArrayList<>();

        for (int i = 0; i < piece.size(); i++) {
            int pieceCount = Integer.parseInt(piece.get(i));
            int pieceEachCount = pieceEachHowNeed.get(i);

            if (i == piece.size() - 1) {
                System.out.print(pieceEachCount-pieceCount);
                break;
            }
            System.out.print(pieceEachCount-pieceCount + " ");
        }
    }

}
