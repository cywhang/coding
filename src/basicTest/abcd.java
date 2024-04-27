package basicTest;

import java.util.Arrays;

public class abcd {

    public static void main(String[] args) {
        int[] answer = new int[52];
        String my_string = "Programmers";
        // A ~ Z, a ~ z 를 전부 담고있는 answer
        // 어떤 알파벳들이 몇번 포함되어있는지 answer에 담기

        // 1. 아스키 코드
        // a = 97, b = 98 ~~~ y = 121, z = 122
        // A = 65, B = 66 ~~~ y = 89, Z = 90
        // 인덱스
        // A ~ Z = -65연산  0 <= i <= 25
        // a ~ z = -71연산  26 <= i <= 51
        char[] chr = my_string.toCharArray();
        int idx = 0;
        for (int i = 0; i < chr.length; i++) {
            int k = (int)chr[i];
            if (97 <= k && k <= 122) {
                // 소문자
                idx = k-71;
            } else {
                // 대문자
                idx = k-65;
            }
            answer[idx]++;
        }
        System.out.println("answer : " + Arrays.toString(answer));

    }
}

/* 유저 풀이
public int[] solution(String my_string) {

        int[] answer = new int[52];

        for (char ch : my_string.toCharArray()) {
            int idx = Character.isUpperCase(ch) ? (ch - 'A') : (ch - 'a' + 26);
            answer[idx]++;
        }

        return answer;
    }
 */
