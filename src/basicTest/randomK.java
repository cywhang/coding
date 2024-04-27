package basicTest;

import java.util.Arrays;

public class randomK {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 2, 3};
        int k = 3;
        int[] answer = solution(arr, k);
        System.out.println("answer: " + Arrays.toString(answer));
    }

    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        arr = Arrays.stream(arr).distinct().toArray();
        if (arr.length < k) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i];
                System.out.println("arr[i]: " +arr[i]);
            }
            for (int i = arr.length; i < k; i++) {
                answer[i] = -1;
            }
        } else {
            for (int i = 0; i < k; i++) {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}
