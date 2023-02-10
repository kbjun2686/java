package programmers.lv0;

import java.util.Arrays;

// 진료 순서 정하기
public class OrderTreatment {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{3, 76, 24})));
    }

    public static class Solution {
        public int[] solution(int[] emergency) {
            int[] asc = new int[emergency.length];
            int[] answer = new int[emergency.length];

            for (int i = 0; i <= emergency.length-1; i++) {
                asc[i] = emergency[i];
            }

            Arrays.sort(asc);

            for (int i = 0; i <= emergency.length-1; i++) {
                for (int j = 0; j <= emergency.length - 1; j++) {
                    if (asc[i]==emergency[j]) {
                        answer[j] = emergency.length-i;
                    }
                }
            }

            return answer;
        }
    }
}

// 다른 풀이
//class Solution {
//    public int[] solution(int[] emergency) {
//        int[] answer = new int[emergency.length];
//
//        for(int i = 0; i < answer.length; i++){
//            if(answer[i] != 0){
//                continue;
//            }
//            int idx = 1;
//            for(int j = 0; j < answer.length; j++){
//                if(emergency[i] < emergency[j]){
//                    idx++;
//                }
//            }
//            answer[i] = idx;
//        }
//        return answer;
//    }
//}