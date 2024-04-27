package basicTest;

import java.util.ArrayList;
import java.util.Arrays;

public class sequence {
    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;
        int[] answer = solution(num_list, n);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int[] num_list, int n) {
        // n-1번째 인덱스 이후부터 n-1번째 인덱스 이전값을 바꿈
        // 2,    1, 6    -->   1, 6,      2
        int[] pre = Arrays.copyOfRange(num_list, 0, n);
        int[] suf = Arrays.copyOfRange(num_list, n, num_list.length);
        System.out.println(Arrays.toString(pre));
        System.out.println(Arrays.toString(suf));
        int[] answer = new int[num_list.length];
        for (int i = 0; i < suf.length; i++) {
            answer[i] = suf[i];
        }
        for (int i = 0; i < pre.length; i++) {
            answer[suf.length+i] = pre[i];
        }
        return answer;
    }

    /*  유저 문제풀이
    public int[] solution(int[] num_list, int n) {
        int idx = 0;
        int[] answer = new int[num_list.length];
        for (int i = n;i < num_list.length;i++)
            answer[idx++] = num_list[i];
        for (int i = 0;i < n;i++)
            answer[idx++] = num_list[i];
        return answer;
    }
     */
}
