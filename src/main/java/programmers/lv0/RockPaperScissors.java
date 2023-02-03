package programmers.lv0;

// 가위 바위 보
public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println(solution("025250025"));
    }

    public static String solution(String rsp) {
        StringBuilder answer = new StringBuilder();

        char[] arr = rsp.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 50) {
                answer.append("0");
                continue;
            }
            if (arr[i] == 48) {
                answer.append("5");
                continue;
            }
            if (arr[i] == 53) {
                answer.append("2");
            }
        }
        return answer.toString();
    }
}

//// case 문
//      for(int i=0; i < arr.length; i++) {
//        switch(arr[i]) {
//          case '0' :
//              answer.append("5");
//              break;
//          case '2' :
//              answer.append("0");
//              break;
//          case '5' :
//              answer.append("2");
//              break;
//          }
//        }
//        return answer.toString();