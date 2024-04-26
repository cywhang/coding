import java.util.Arrays;

public class twoArray2 {
    public static void main(String[] args) {
        int[][] arr = {{57, 192, 534, 2}, {9, 345, 192, 999}};
        int[][] answer = solution(arr);
        System.out.println("answer: " + Arrays.deepToString(answer));
    }

    public static int[][] solution(int[][] arr) {
        System.out.println("행: " + arr.length);
        System.out.println("열: " + arr[0].length);
        int a = arr.length;
        int b = arr[0].length;
        if (a > b) {
            int[][] answer = new int[a][a];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        } else if (a < b){ // 행의 개수가 더 작다면
            int[][] answer = new int[b][b];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        }
        return arr;
    }
}

/*
    public int[][] solution(int[][] arr) {
        int max = Math.max(arr.length, arr[0].length);
        int[][] array = new int[max][max];

        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, array[i], 0, arr[0].length);
        }
        return array;
    }
 */
