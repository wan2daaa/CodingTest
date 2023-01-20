package wane.백준.단계별.조건문;

import java.util.List;
import java.util.Scanner;

public class Q25304 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int TotalPrice = Integer.parseInt(sc.nextLine());
        int ProductCount = Integer.parseInt(sc.nextLine());
        int comparePrice = 0;

        for (int i = 0; i < ProductCount; i++) {
            String eachProductPriceCountStr = sc.nextLine();

            List<String> eachProductPriceCount = List.of(eachProductPriceCountStr.split("\\s+"));

            int productPrice = Integer.parseInt(eachProductPriceCount.get(0));
            int productCount = Integer.parseInt(eachProductPriceCount.get(1));
            comparePrice += productPrice * productCount;
        }

        if (TotalPrice == comparePrice) {
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }
    }

}
