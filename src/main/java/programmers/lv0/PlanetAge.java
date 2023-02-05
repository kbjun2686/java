package programmers.lv0;

import java.util.Arrays;

// 외계행성의 나이
public class PlanetAge {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(23));
    }

    public static class Solution {
        public String solution(int age) {
            StringBuilder answer = new StringBuilder();
            String[] planetAge = {"a","b","c","d","e","f","g","h","i","j"};
            String[] earthAge = {"0","1","2","3","4","5","6","7","8","9"};

            String a = String.valueOf(age);
            String[] arr = a.split("");

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < earthAge.length; j++) {
                    if (arr[i].equals(earthAge[j])) {
                        answer.append(planetAge[j]);
                    }
                }
            }
            return answer.toString();
        }
    }

}

// 다른 풀이
//class Solution {
//    public String solution(int age) {
//        String answer = "";
//        String[] alpha = new String[]{"a","b","c","d","e","f","g","h","i","j"};
//
//        while(age>0){
//            answer = alpha[age % 10] + answer;
//            age /= 10;
//        }
//
//        return answer;
//    }
//}