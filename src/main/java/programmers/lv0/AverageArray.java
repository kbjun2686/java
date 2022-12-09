package programmers.lv0;

// 배열의 평균값
public class AverageArray {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{89,90,91,92,93,94,95,96,97,98,99}));
    }
    public static double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        answer = sum / numbers.length;

        return answer;
    }
}
