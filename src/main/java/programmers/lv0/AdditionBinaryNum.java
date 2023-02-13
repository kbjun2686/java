package programmers.lv0;

// 이진수 더하기
public class AdditionBinaryNum {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("10", "11"));
    }

    public static class Solution {
        public String solution(String bin1, String bin2) {
            return Integer.toBinaryString(Integer.parseInt(bin1,2) + Integer.parseInt(bin2,2));
        }
    }
}
