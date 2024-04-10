import java.util.ArrayList;
import java.util.Arrays;

public class array1 {

    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        int l = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int num : list) {
            answer[l++] = num;
        }

        System.out.println("answer : " + Arrays.toString(answer));
    }
}

/* 유저 풀이 (count 미리 선언)
 public int[] solution(int n, int k) {
        int count = n / k;


        int[] answer = new int[count];

        for (int i = 1; i <= count; i++) {
            answer[i - 1] = k * i;
        }

        return answer;
    }
 */
