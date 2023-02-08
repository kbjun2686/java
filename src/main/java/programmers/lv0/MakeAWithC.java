package programmers.lv0;

import java.util.Arrays;

// A로 B 만들기
public class MakeAWithC {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("olleh", "hello"));
    }

    public static class Solution {
        public int solution(String before, String after) {
            int answer = 0;

            String[] beforeArr = before.split("");
            String[] afterArr = after.split("");

            Arrays.sort(beforeArr);
            Arrays.sort(afterArr);

            if (Arrays.equals(beforeArr, afterArr)) {
                answer = 1;
            } else {
                answer = 0;
            }
            return answer;
        }
    }
}

// char 배열으로 sort

//class Solution {
//    public int solution(String before, String after) {
//        char[] a = before.toCharArray();
//        char[] b = after.toCharArray();
//        Arrays.sort(a);
//        Arrays.sort(b);
//
//        return new String(a).equals(new String(b)) ? 1 :0;
//    }
//}
