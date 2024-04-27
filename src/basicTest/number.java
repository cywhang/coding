package basicTest;

import java.math.BigInteger;

public class number {
    public static void main(String[] args) {
        String a = "18446744073709551615";
        String b = "287346502836570928366";
        String answer = solution(a, b);
        System.out.println("answer : " + answer);
    }
    /*
        0 이상의 두 정수가 문자열 a, b로 주어질 때
        a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.
     */
    public static String solution(String a, String b) {
        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);

        //add / subtract / mutiply / divide 함수를 지원한다.
        BigInteger answer = aa.add(bb);
        return ""+answer;
    }
}
