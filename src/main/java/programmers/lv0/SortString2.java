package programmers.lv0;

import java.util.Arrays;

// 문자열 정렬하기(2)
public class SortString2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("Bcad"));
    }

    public static class Solution {
        public String solution(String my_string) {
            String answer = my_string.toLowerCase();
            String[] result = answer.split("");

            Arrays.sort(result);


            return String.join("", result);
        }
    }
}
