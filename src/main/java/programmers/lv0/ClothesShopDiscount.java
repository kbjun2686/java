package programmers.lv0;

// 옷가게 할인받기
public class ClothesShopDiscount {
    public static void main(String[] args) {
        System.out.println(solution(150000));
        System.out.println(solution(580000));
        System.out.println(solution(150010));
    }

    public static int solution(int price) {
        double answer = 0;

        if (price >= 100000 && price < 300000) {
            answer = price - (price * 0.05);
        } else if (price >= 300000 && price < 500000) {
            answer = price - (price * 0.1);
        } else if (price >= 500000){
            answer = price - (price * 0.2);
        } else {
            answer = price;
        }
        return (int) answer;
    }
}
