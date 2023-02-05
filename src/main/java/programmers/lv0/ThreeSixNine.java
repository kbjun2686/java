package programmers.lv0;

// 369게임
public class ThreeSixNine {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(29423));
    }
    
    public static class Solution {
        public int solution(int order) {
            int answer = 0;

            while (order > 0) {
                if (order%10 == 3 || order%10 == 6 || order%10 == 9) {
                    answer++;
                }
                order /= 10;
            }
            return answer;
        }
    }
}
