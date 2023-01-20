package wane.백준.단계별.함수;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q4673 {



    public static void main(String[] args) {

        Set<Integer> selfNumberList = new HashSet<>();

        List<Integer> notSelfNumberList = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            notSelfNumberList.add(i);
        }


        for (int num = 1; num <= 10000; num++) {
            int eachNum = num;
            Integer total = eachNum;

            while (eachNum > 0) {
                total += eachNum % 10;
                eachNum /= 10;
            }

            if (notSelfNumberList.contains(total)) {
                notSelfNumberList.remove(total);
            }
        }

        for (Integer integer : notSelfNumberList) {
            System.out.println(integer);
        }
    }
}
