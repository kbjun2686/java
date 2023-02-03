package programmers.lv0;

import java.util.Arrays;

// 가장 큰 수 찾기
public class FindLargestNum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 8, 3})));
        System.out.println(Arrays.toString(solution(new int[]{9, 10, 11, 8})));
    }

    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        int largest = 0;
        int idx = 0;

        for (int i = 0; i < array.length; i++) {
            // 만약 배열1번 값이 최대값보다 크다면
            if (largest < array[i]) {
                // largest에 값 저장
                // idx 에 위치 저장
                largest = array[i];
                idx = i;
            }
        }
        answer[0] = largest;
        answer[1] = idx;

        return answer;
    }
}
