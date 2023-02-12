package programmers.lv0;

// 숨어있는 숫자의 덧셈(2)
public class AttentionHiddenNum {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("aAb1B2cC34oOp"));
    }

    public static class Solution {
        public int solution(String str) {
            int answer = 0;

            String[] ms = str.split("[a-zA-Z]");

            for (int i = 0; i < ms.length; i++) {
                answer+= !ms[i].isEmpty() ? Integer.parseInt(ms[i]) :0;
            }

            return answer;
        }
    }
}
