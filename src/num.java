import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class num {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 1},{1, 2},{2, 3}};
        int[] answer = solution(arr, queries);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                int k = arr[j]+1;

            }
        }
        return answer;
    }
}
