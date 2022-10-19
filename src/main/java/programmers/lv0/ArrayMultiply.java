package programmers.lv0;

import java.util.Arrays;

public class ArrayMultiply {
    public static void main(String[] args) {
        System.out.println("result: " + Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}


