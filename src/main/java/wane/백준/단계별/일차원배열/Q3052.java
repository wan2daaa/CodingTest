package wane.백준.단계별.일차원배열;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Q3052 {

    public static void main(String[] args) {

        int count = 10;
        Scanner sc = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            numList.add(sc.nextInt()%42);
        }

        Set<Integer> numSet = new HashSet<>(numList);

        System.out.print(numSet.size());




    }
}
