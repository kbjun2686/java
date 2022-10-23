package programmers.lv0;

public class SharingPizza3 {
    public static void main(String[] args) {
        System.out.println(solution(7,10));
        System.out.println(solution(4,12));
    }

    public static int solution(int slice, int n) {
        int answer = 0;

        if(slice > 1) {
            answer = n / slice;
            if(n % slice != 0) {
                answer++;
            }
        }
        return answer;
    }
}
