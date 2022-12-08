package programmers.lv0;

// 개미 군단
public class AntCorps {
    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(24));
        System.out.println(solution(999));
    }

    public static int solution(int hp) {
        int answer = 0;
        int generalAnt = 5;
        int soldierAnt = 3;
        int workerAnt = 1;

        answer += hp /generalAnt;
        hp %= generalAnt;
        answer += hp /soldierAnt;
        hp %= soldierAnt;
        answer += hp /workerAnt;
        hp %= workerAnt;

        return answer;
    }
}
