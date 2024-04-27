package basicTest;

import java.util.Arrays;

public class dice {
    public static void main(String[] args) {
        int a = 4;
        int b = 1;
        int c = 4;
        int d =4;
        int answer = 0;
        int[] arr = {a,b,c,d};
        Arrays.sort(arr);
        a=arr[0]; b=arr[1]; c=arr[2]; d=arr[3];  // a~d를 낮은수부터 정렬
        /*
           -- 1 ~ 6이 적힌 주사위 4개 있음 --
           1. 네 주사위 모두 p로 같다면 1111 * p점을 얻음.
           2. 세 주사위가 p로 같고 나머지 숫자가 q라면 (10 * p +q)^2점을 얻음
           3. 두 주사위가 p와 q로 같다면 (p + q) * (p - q)점을 얻음.
           4. 두 주사위가 p로 같고 나머지 숫자가 q, r이라면 q * r점을 얻음
           5. 네 주사위가 모두 다르다면 숫자중 가장 작은 숫자 점수를 얻음.
         */
        answer = a==d      ? a*1111 :            // 네수가 같을 때
                a==c      ? (10*a+d)*(10*a+d) : // abc가 같을 때
                b==d      ? (10*b+a)*(10*b+a) : // bcd가 같을 때
                a==b&c==d ? c*c-a*a :           // 두개씩 두쌍이 같을 때
                a==b      ? c*d :               // ab가 같을 때
                b==c      ? a*d :               // bc가 같을 때
                c==d      ? a*b :               // cd가 같을 때
                a;                              // 모두 다를 때
        System.out.println(answer);
    }
}
