package programmers.lv0;

// 머쓱이보다 키 큰 사람
public class TallPerson {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{149, 180, 192, 170},167));
    }

    public static int solution(int[] array, int height) {
        int answer = 0;
        int cnt = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i]>height) {
                cnt++;
            }
        }
        return answer = cnt;
    }
}
