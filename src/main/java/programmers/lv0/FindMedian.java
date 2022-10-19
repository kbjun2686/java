package programmers.lv0;

import java.util.Arrays;

public class FindMedian {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 8, 1, 4, 5}));
    }
    public static int solution(int[] array) {
        int answer = 0;
        int size = array.length;

        Arrays.sort(array);

        answer = array[size/2];

        return answer;
    }
}
