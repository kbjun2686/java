package programmers.lv0;

// 암호 해독
public class DecryptionEncryption {
    public static void main(String[] args) {
        Solution result = new Solution();
        System.out.println(result.solution("dfjardstddetckdaccccdegk", 4));
    }

    static class Solution {
        public String solution(String cipher, int code) {
            StringBuilder answer = new StringBuilder();
            char[] arr = cipher.toCharArray();

            for (int i = 0; i < arr.length; i++) {
                if ((i+1)%code == 0){
                    answer.append(arr[i]);
                }
            }
            return answer.toString();
        }
    }
}
