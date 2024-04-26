import java.util.Arrays;

public class twoArray {
    public static void main(String[] args) {
        int n = 3;
        int[][] answer = solution(n);
        System.out.println(Arrays.deepToString(answer));
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int k=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == k) {
                    answer[i][j] = 1;
                    k++;
                    break;
                } else {
                    answer[i][j] = 0;
                }
            }
        }
        return answer;
    }
}

/*
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }
 */
