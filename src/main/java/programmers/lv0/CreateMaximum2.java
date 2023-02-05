package programmers.lv0;

import java.util.Arrays;

// 최댓값 만들기(2)
public class CreateMaximum2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1,2,-3,4,-5}));
    }

    public static class Solution {
        public int solution(int[] numbers) {

            Arrays.sort(numbers);
            int num1 = numbers[0]*numbers[1];
            int num2 = numbers[numbers.length-1]*numbers[numbers.length-2];

            if (num1 > num2) {
                return num1;
            } else {
                return num2;
            }
        }
    }
}
