package programmers.lv0;

// 공 던지기
public class ThrowBall {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1,2,3,4}, 2));
    }

    public static class Solution {
        public int solution(int[] numbers, int k) {
            int answer = 0;

            answer = numbers[2 * (k-1) % numbers.length];

            return answer;
        }
    }
}
