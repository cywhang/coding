import java.util.Arrays;

public class coffee {
    public static void main(String[] args) {
        String[] order = {"americanoice", "americano", "iceamericano"};
        int answer = solution(order);
        System.out.println("answer: " + answer);
    }
    /*
        커피 심부름
        아메리카노, 카페 라떼 = 4500원 : 5000원
        hot과 ice로 구분, 적혀있지않으면 ice로 통일
        아무거나 = 아이스 아메리카노
     */
    public static int solution(String[] order) {
        int answer = 0;
        for (String cof : order) {
            if (cof.contains("cafelatte")) {
                answer += 5000;
            } else  {
                answer += 4500;
            }
        }

        return answer;
    }
}
