package programmers.lv0;

import java.util.Arrays;

// 짝수는 싫어요
public class HateEvenNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
    }

        public static int[] solution(int n) {

            int size = 0;
            for(int i = 1; i <= n; i++) {
                if(i%2 != 0) {
                    size++;
                }
            }

            int[] answer = new int[size];

            int idx = 0;
            for(int j = 1; j <= n; j++) {
                if(j%2 != 0) {
                    answer[idx++] = j;
                }
            }

            return answer;
        }
    }
