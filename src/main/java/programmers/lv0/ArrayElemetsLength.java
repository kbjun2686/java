package programmers.lv0;

import java.util.Arrays;

public class ArrayElemetsLength {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"We", "are", "the", "world!"})));
    }

    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for(int i = 0; i< strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
