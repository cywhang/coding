import java.util.Arrays;

public class object {
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int n = 3;
        int[] answer = solution(num_list, n);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] num_list, int n) {
        int l = num_list.length-n+1;
        int[] answer = new int[l];
        int k = 0;
        for (int i = n-1; i < num_list.length; i++) {
            answer[k++] = num_list[i];
        }
        return answer;
    }
}

/*  유저 문제풀이
public int[] solution(int[] num_list, int n) {
        int[] a= Arrays.copyOfRange(num_list, n-1, num_list.length);
        return a;
    }

 */