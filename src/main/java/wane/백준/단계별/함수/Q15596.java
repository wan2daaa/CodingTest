package wane.백준.단계별.함수;

public class Q15596 {

    long sum(int[] a) {
        int listLength = a.length;
        int sum = 0;

        for (int i = 0; i < listLength; i++) {
            sum += a[i];
        }

        return sum;
    }

}
