package programmers.lv0;

// 중복된 숫자 개수
public class DuplicateNumbers {
    public static void main(String[] args) {
        System.out.println("result: " + solution(new int[]{1, 1, 2, 3, 4, 5},1));
    }

    public static int solution(int[] array, int n) {
        int answer = 0;
        int cnt = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i]==n) {
                cnt++;
            }
        }
        return answer = cnt;
    }
}
