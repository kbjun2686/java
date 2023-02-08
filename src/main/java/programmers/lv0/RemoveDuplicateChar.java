package programmers.lv0;

// 중복된 문자 제거
public class RemoveDuplicateChar {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("people"));
    }

    public static class Solution {
        public String solution(String my_string) {
            String answer = "";

            for (int i = 0; i < my_string.length(); i++) {
                if (my_string.indexOf(my_string.charAt(i)) == i) {
                    answer += my_string.charAt(i);
                }
            }
            return answer;
        }
    }
}
