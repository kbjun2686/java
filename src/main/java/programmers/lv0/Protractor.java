package programmers.lv0;

// 각도기
public class Protractor {
    public static void main(String[] args) {
        System.out.println(solucion(90));
    }
    public static int solucion(int angle) {
        int answer = 0;

        if(angle > 0 && angle < 90) {
            return answer = 1;
        } else if(angle == 90) {
            return answer = 2;
        } else if(angle > 90 && angle < 180) {
            return answer = 3;
        } else if(angle == 180) {
            return answer = 4;
        }
        return answer;
    }
}
