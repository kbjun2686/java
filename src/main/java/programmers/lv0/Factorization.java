package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 소인수분해
public class Factorization {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(420)));
    }

    public static class Solution {
        public int[] solution(int n) {
            List<Integer> list = new ArrayList<>();

            for (int i = 2; i <= n; i++) {
                if (n%i == 0) {
                    while(n%i == 0) {
                    n/=i;
                    }
                    list.add(i);
                }
            }

            int[] answer = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}
