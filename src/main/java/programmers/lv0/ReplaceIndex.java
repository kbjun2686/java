package programmers.lv0;

import java.util.Arrays;

// 인덱스 바꾸기
public class ReplaceIndex {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("hello", 1, 2));
    }

    public static class Solution {
        public String solution(String my_string, int num1, int num2) {
           char[] arr = my_string.toCharArray();
           char[] answer = new char[arr.length];

            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i];
            }
            answer[num1] = arr[num2];
            answer[num2] = arr[num1];

           return String.valueOf(answer);
        }
    }
}
