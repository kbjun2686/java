package programmers.lv0;

import java.util.Arrays;

// 짝수 홀수 개수
public class EvenOddNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                answer[0] += 1;
            } else if(num_list[i] % 2 != 0) {
                answer[1] += 1;
            }
        }
        return answer;
    }
}
