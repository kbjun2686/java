package programmers.lv0;

// 컨트롤 제트
public class CtrlZ {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("1 2 Z 3"));
    }

    public static class Solution {
        public int solution(String s) {
            int answer = 0;

            String[] list = s.split(" ");

            for (int i = 0; i < list.length; i++) {
                if (!list[i].equals("Z")) {
                    answer += Integer.parseInt(list[i]);
                } else {
                    answer -= Integer.parseInt(list[i-1]);
                }
            }
            return answer;
        }
    }
}
