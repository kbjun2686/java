package programmers.lv0;

// 편지
public class Letter {
    public static void main(String[] args) {
        System.out.println(solution("hi"));
    }
    public static int solution(String message) {
        int answer = message.length()*2;

        return answer;
    }
}
