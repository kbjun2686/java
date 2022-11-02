package programmers.lv0;

// 세균 증식
public class BacterialGrowh {
    public static void main(String[] args) {
        System.out.println(solution(2,10));
        System.out.println(solution(7,15));
    }

    public static int solution(int n, int t) {
        int answer = n;

        for (int i = 1; i <= t; i++) {
            answer *= 2;
        }

        return answer;
    }
}
