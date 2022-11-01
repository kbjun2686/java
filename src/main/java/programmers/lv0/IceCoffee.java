package programmers.lv0;

import java.util.Arrays;

// 아이스 아메리카노
public class IceCoffee {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(4000)));
    }

    public static int[] solution(int money) {
        int[] answer = new int[2];
        int coffee = 5500;

        answer[0] = money/coffee;
        answer[1] = money%coffee;

        return answer;
    }
}
