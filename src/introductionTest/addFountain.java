package introductionTest;

import java.util.Arrays;

public class addFountain {
    public static void main(String[] args) {
        int numer1 = 1; int denom1 = 2;

        int numer2 = 3; int denom2 = 4;
        int[] answer = solution(numer1, denom1, numer2, denom2);
        System.out.println("answer : " + Arrays.toString(answer));
    }
    /*
        8 20
        4 10
        2 5
        12 24
        2  6
        numer1, 2 = 분자
        denom1, 2 = 분모
        분모에 대한 통분이 이루어져야 함.

     */
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int cc = 0;
        int mm = 0;
        // 분모가 같을때
        // 분모가 다를때 (통분)
        return answer;
    }
}
