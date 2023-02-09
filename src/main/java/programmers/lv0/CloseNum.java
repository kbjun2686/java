package programmers.lv0;

import java.util.Arrays;

// 가까운 수
public class CloseNum {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{3,10,28}, 20));
    }

    public static class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;

            Arrays.sort(array);

            for (int i = 0; i < array.length; i++) {
                if (array[i] <= n) {
                    continue;
                } else {
                    int sub1 = n - array[i-1];
                    int sub2 = array[i] - n;

                    if (sub1 > sub2) {
                        answer = array[i];
                        return answer;
                    } else if(sub1 < sub2) {
                        answer = array[i-1];
                        return answer;
                    } else {
                        answer = array[i-1];
                        return answer;
                    }
                }
            }
            answer = array[array.length - 1];

            return answer;
        }
    }
}
