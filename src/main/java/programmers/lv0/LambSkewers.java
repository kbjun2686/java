package programmers.lv0;

// 양꼬치
public class LambSkewers {
    public static void main(String[] args) {
        System.out.println(solution(64, 6));
    }
    public static int solution(int n, int k) {
        int answer = 0;

        int food = 12000;
        int drink = 2000;

        int totalFood = n * food;
        int totalDrink = k * drink;
        int service = (n/10)*drink;

        answer = totalFood + totalDrink - service;


        return answer;
    }
}
