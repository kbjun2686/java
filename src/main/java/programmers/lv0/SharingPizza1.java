package programmers.lv0;

public class SharingPizza1 {
    public static void main(String[] args) {
        System.out.println(solution(7));
        System.out.println(solution(1));
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        int answer = 0;

        if(n > 0) {
            answer = n / 7;
            if(n%7 != 0) {
                answer++;
            }
        }

        return answer;
    }
}
