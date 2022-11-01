package programmers.lv0;

import java.util.Arrays;

// 배열 자르기
public class CutArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, 1, 3)));
        System.out.println(Arrays.toString(solution(new int[]{1,3,5}, 1, 2)));
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[(num2 - num1) + 1];
        int idx = num1;

        for (int i = 0; i < (num2 - num1) + 1; i++) {
            answer[i] = numbers[idx];
            idx++;
        }

        return answer;
    }
}
