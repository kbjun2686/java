package programmers.lv0;

// 피자 나눠 먹기(2)
public class SharingPizza2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10));
    }

    public static class Solution {
        public int solution(int n) {
            int answer = 0;
            int cutPizza = 6;

            for (int i = 1; i <= n; i++) {
                if ((cutPizza*i) % n == 0) {
                    answer = i;
                    break;
                }
            }
            return answer;
        }
    }
}
