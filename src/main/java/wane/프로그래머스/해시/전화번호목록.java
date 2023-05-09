package wane.프로그래머스.해시;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: wan2daaa
 */
public class 전화번호목록 {

    static class Solution {

        public static void main(String[] args) {

            System.out.println(solution(new String[]{"11", "1"}));
        }
        public static boolean solution(String[] phone_book) {

            Arrays.sort(phone_book);
            Set<String> set = new HashSet<>();

            for (String phone : phone_book) {
                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < phone.length(); i++) {
                    sb.append(phone.charAt(i));
                    if (set.contains(sb.toString())) {
                        return false;
                    }
                }
                set.add(sb.toString());
            }
            return true;
        }
    }

}
