package programmers.lv0;

import java.util.Arrays;

// 2차원으로 만들기
public class TwoDimensionalArr {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.deepToString(s.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
    }

    public static class Solution {
        public int[][] solution(int[] num_list, int n) {
            int[][] answer = {};

            int length = num_list.length;

            answer = new int[length/n][n];

            for (int i = 0; i < length; i++) {
                answer[i/n][i%n] = num_list[i]; // 나누기와 나머지
            }
            return answer;
        }
    }
}

// 다른풀이
//class Solution {
//    public int[][] solution(int[] num_list, int n) {
//        int[][] answer = new int[num_list.length/n][n];
//        int cnt = 0;
//        for(int i = 0 ; i < num_list.length/n ; i++){
//            for(int j = 0 ; j < n ; j++){
//                answer[i][j] = num_list[cnt];
//                cnt++;
//            }
//        }
//        return answer;
//    }
//}
