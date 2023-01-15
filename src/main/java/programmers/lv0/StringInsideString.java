package programmers.lv0;

// 문자열 안에 문자열
public class StringInsideString {
    public static void main(String[] args) {
        System.out.println(solution("ab6CDE443fgh22iJKlmn1o","6CD"));
    }

    public static int solution(String str1, String str2) {
        int answer = 0;

        if(str1.contains(str2)) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }
}
