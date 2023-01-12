package programmers.lv0;

import java.util.Arrays;

// n의 배수 구하기
public class MultipleN {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})));
    }

    public static int[] solution(int n, int[] numlist) {
        int[] arr = new int[numlist.length];
        int count = 0;

        for(int i = 0; i < numlist.length; i++){
            if( numlist[i]%n == 0){
                arr[count] = numlist[i];
                count++;
            }
        }

        int[] answer = new int[count];
        for(int i = 0; i<count; i++){
            answer[i] = arr[i];
        }

        return answer;
    }
}
