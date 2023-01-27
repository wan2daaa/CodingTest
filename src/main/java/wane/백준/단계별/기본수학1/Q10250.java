package wane.백준.단계별.기본수학1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10250 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int repeatCount = sc.nextInt();

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < repeatCount; i++) {
            int height = sc.nextInt(); //호텔 층수
            int width = sc.nextInt();  //층 별 방 개수
            int customerCount = sc.nextInt();

            //101 201 301 401, 501, 601 , 102, 202, 302,

            int findWhichWidth = customerCount / height;
            int findWhichHeight = customerCount % height;
            if (findWhichHeight == 0) {
                resultList.add(height * 100 + findWhichWidth);
            }else{
                resultList.add(findWhichHeight * 100 + findWhichWidth + 1);
            }
        }
        for (Integer result : resultList) {
            System.out.println(result);
        }
    }

}
