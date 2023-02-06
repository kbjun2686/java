package programmers.lv0;

public class FindNum {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(29183,1));
    }
    public static class Solution {
        public int solution(int num, int k) {
            String numS = Integer.toString(num);
            String kS = Integer.toString(k);

            if(!numS.contains(kS)) { // .contains() : 문자열 포함 여부 확인
                return -1;
            } else {
                return numS.indexOf(kS)+1; // .indexOf() : 특정 문자 위치 찾기 // 자리 수 이기 때문에 +1
            }
        }
    }
}
