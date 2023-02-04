package programmers.lv0;

import java.util.Arrays;

// 배열 회전시키기
public class RotateArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{4,455,6,4,-1,45,6}, "left")));
    }
    public static class Solution{
        public int[] solution(int[] numbers, String direction) {
            if (direction.equals("right")) {
                int temp = numbers[numbers.length - 1];
                for (int i = numbers.length - 2; i >= 0; i--) {
                    numbers[i + 1] = numbers[i];
                }
                numbers[0] = temp;
                return numbers;
            } else {
                int temp = numbers[0];
                for (int i = 0; i <= numbers.length - 2; i++) {
                    numbers[i] = numbers[i + 1];
                }
                numbers[numbers.length - 1] = temp;
                return numbers;
            }
        }
    }
}
