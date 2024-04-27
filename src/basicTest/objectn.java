package basicTest;

import java.util.Arrays;

public class objectn {
    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n = 2;
        int[] answer = solution(num_list, n);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[(num_list.length-1) / n + 1];
        int k = 0;
        for (int i = 0; i < num_list.length; i+=n) {
            answer[k++] = num_list[i];
        }
        return answer;
    }
}
