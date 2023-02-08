package programmers.lv0;


// 모스부호(1)
public class MorseCode1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(".... . .-.. .-.. ---"));
    }

    public static class Solution {
        public String solution(String letter) {
            StringBuilder answer = new StringBuilder();
            String[] letterArr = letter.split(" ");
            String[] morseArr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            String[] alphabetArr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

            for (int i = 0; i < letterArr.length; i++) {
                for (int j = 0; j < morseArr.length; j++) {
                    if (letterArr[i].equals(morseArr[j])) {
                        answer.append(alphabetArr[j]);
                    }
                }
            }
            return answer.toString();
        }
    }
}
