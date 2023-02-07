package programmers.lv0;

// 합성수 찾기
public class FindCompositeNum {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10));
    }

    public static class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int i = 4; i <= n; i++) {
                if (isValue(i)) {
                    answer++;
                }
            }
            return answer;
        }

        public boolean isValue(int num) {
            int cnt = 0;
            for (int i = 1; i <= Math.sqrt(num); i++) {
                if (num%i == 0) {
                    cnt++;
                }
            }
                return cnt >= 2;
        }
    }
}
