package programmers.lv0;


// 대문자와 소문자
public class UppercaseLowercase {
    public static void main(String[] args) {
        Solution result = new Solution();
        System.out.println(result.solution("cccCCC"));
    }
}

class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (65 <= arr[i] && arr[i] <= 90) {
                arr[i] = (char) (arr[i] + 32);
                continue;
            }
            if (97 <= arr[i] && arr[i] <= 122) {
                arr[i] = (char) (arr[i] - 32);
            }
        }
        return String.valueOf(arr);
    }
}