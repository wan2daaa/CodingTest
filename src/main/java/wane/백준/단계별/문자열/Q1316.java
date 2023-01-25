package wane.백준.단계별.문자열;

import java.util.Scanner;

public class Q1316 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int count = 0;
        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            if (check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = in.next();

        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);	// i 번째 문자 저장 (현재 문자)


            // 앞선 문자와 i 번째 문자가 같지 않다면?
            if (prev != now) {

                // 해당 문자가 처음 나오는 경우 (false 인 경우)
                if ( check[now - 'a'] == false ) {
                    check[now - 'a'] = true;		// true 로 바꿔준다
                    prev = now;					// 다음 턴을 위해 prev 도 바꿔준다
                }

                // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨)
                else {
                    return false;	//함수 종료
                }
            }
            // 앞선 문자와 i 번째 문자가 같다면? (연속된 문자)
            // else 문은 없어도 됨
            else {
                continue;
            }
        }
        return true;
    }
}

//import java.util.HashSet;
//import java.util.List;
//import java.util.Scanner;
//import java.util.Set;
//
//public class Q1316 {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int count = sc.nextInt();
//        int resultCount = 0;
//
//        for (int i = 0; i < count; i++) {
//            String word = sc.next();
//            String[] splitWord = word.split("");
//
//            Set<String> setWord = new HashSet<>(List.of(splitWord));
//
//            for (String eachSetWord : setWord) {
////                System.out.print(eachSetWord + ": ");
//                int eachWordCount = 0;
//                String compareStr = "";
//                boolean resultBool = false;
//                for (String eachWord : splitWord) {
//                    if (eachSetWord.equals(eachWord)){
//                        eachWordCount++;
//                    }
//                }
////                    System.out.print(eachWordCount + "\t");
//
//                for (int j = 0; j < eachWordCount; j++) {
//                    compareStr+=eachSetWord;
//                }
////                System.out.println("eachSetWord : " + compareStr);
//
//                if (splitWord.length == eachWordCount) {
//                    resultCount++;
//                    resultBool = true;
//                }else {
//                    for (int j = 0; j < splitWord.length-eachWordCount; j++) {
//                        if (word.substring(j, j+eachWordCount).equals(compareStr)) {
//                            resultCount++;
//                            resultBool = true;
//                        }else break;
//                    }
//                }
//
//                if (resultBool) {
//                    break;
//                }
//            }
//
//        }
//            System.out.print(resultCount);
//
//
//
//    }
//
//}
