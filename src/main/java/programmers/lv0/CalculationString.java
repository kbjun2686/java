package programmers.lv0;

// 문자열 계산하기
public class CalculationString {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("3 + 4"));
    }

    public static class Solution {
        public int solution(String my_string) {
            int answer = 0;

            String[] str = my_string.split(" ");
            boolean mode = true;
            for (int i = 0; i < str.length; i++) {
                if (i == 0) {
                    answer += Integer.parseInt(str[i]);
                } else {
                    if (str[i].equals("+")) {
                        mode = true;
                    } else if (str[i].equals("-")) {
                        mode = false;
                    } else {
                        if (mode) {
                            answer += Integer.parseInt(str[i]);
                        } else {
                            answer -= Integer.parseInt(str[i]);
                        }
                    }
                }
            }

            return answer;
        }
    }
}
