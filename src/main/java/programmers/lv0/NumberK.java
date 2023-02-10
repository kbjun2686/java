package programmers.lv0;

public class NumberK {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(1,13,1));
    }

    public static class Solution {
        public int solution(int i, int j, int k) {
            String answer = "";

            for(int l = i; l <= j; l++){
                answer += l+"";
            }
            return answer.length()-answer.replace(k+"","").length();
        }
    }
}

// 다른 풀이
//class Solution {
//    public int solution(int i, int j, int k) {
//        int answer = 0;
//
//        for (int num = i; num <= j; num++){
//            int tmp = num;
//            while (tmp != 0){
//                if (tmp % 10 == k)
//                    answer++;
//                tmp /= 10;
//            }
//        }
//        return answer;
//    }
//}
