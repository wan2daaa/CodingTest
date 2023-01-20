package wane.백준.단계별.일차원배열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q5597 {

    public static void main(String[] args) {

        int count = 30;
        Scanner sc = new Scanner(System.in);

        List<String> students = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            students.add(String.valueOf(i));
        }


        for (int i = 0; i < count-2; i++) {
            students.remove(sc.next());
        }

        for (String student : students) {
            System.out.println(student);
        }

    }
}
