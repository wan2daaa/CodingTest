package wane.프로그래머스.해시;

import java.util.HashMap;
import java.util.Set;

/**
 * @author: wan2daaa
 */
public class 완주하지못한선수 {

    public static void main(String[] args) {
        Solution solution = new Solution();

        String solution1 = solution.solution(new String[]{"a", "b", "b", "b"}, new String[]{"a","b", "b"});
        System.out.println(solution1);
    }
    static class Solution {
        public String solution(String[] participant, String[] completion) {
            HashMap<String, Integer> hashMap = new HashMap<>();

            for (String s : participant) {
                if (hashMap.get(s) == null) {
                    hashMap.put(s, 1);
                }else {
                    hashMap.put(s, hashMap.get(s)+1);
                }

            }

            for (String s : completion) {
                hashMap.put(s, hashMap.get(s)-1);
            }

            Set<String> hashKey = hashMap.keySet();

            for (String s : hashMap.keySet()) {
                if (hashMap.get(s) != 0) {
                    return s;
                }
            }

            return null;
        }

    }

}
