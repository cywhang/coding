import java.util.Arrays;

public class asc5 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};
        int[] answer = solution(num_list);
        System.out.println("answer: " + Arrays.toString(answer));
    }

    public static int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] answer = new int[5];
        for (int i = 0; i < 5; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
}

/*
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);

        return Arrays.copyOfRange(num_list, 0, 5);
    }


    * 메모 *
    copyOfRange(array, first, last);
 */
