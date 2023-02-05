package programmers.lv0;

// 주사위의 개수
public class Dice {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{10,8,6}, 3));
    }
    public static class Solution {
        public int solution(int[] box, int n) {
            int answer;
            answer = (box[0] / n)*(box[1] / n)*(box[2] / n);
            return answer;
        }
    }
}
