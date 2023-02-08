package programmers.lv0;

// 팩토리얼
public class Factorial {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3628800));
    }

    public static class Solution {
        public int solution(int n) {
            int answer = 0;
            int sum = 1;

            for (int i = 1; i <= n; i++) {
                if (sum*i <= n) {
                    sum *= i;
                    answer++;
                } else {
                    break;
                }
            }
            return answer;
        }
    }
}
