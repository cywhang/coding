import java.lang.reflect.Array;
import java.util.Arrays;

public class number99 {
    public static void main(String[] args) {
        int n = 4;
        int[][] answer = solution(n);
        System.out.println("answer: " + Arrays.deepToString(answer));
    }
    /*
        n * n 크기의 배열을 생성
        1부터 n^2 까지 정수를 
        인덱스[0][0] 부터 시계방향 나선형으로 배치

        n = 4
        행 \ 열	0	1	2	3
            0	1	2	3	4
            1	12	13	14	5
            2	11	16	15	6
            3	10	9	8	7

        n = 5
        행 \ 열	0	1	2	3	4
            0	1	2	3	4	5
            1	16	17	18	19	6
            2	15	24	25	20	7
            3	14	23	22	21	8
            4	13	12	11	10	9
     */
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        // 배열에 채울 값
        int num=1;
        //
        int start=0;
        //
        int end=n;
        
        // 배열에 값을 다 채울때까지 반복
        while(num <= n*n){

            // 오른쪽으로 이동 
            for(int j=start;j<end;j++)
                answer[start][j]=num++;
            // 아래로 이동
            for(int i=start+1;i<end;i++)
                answer[i][end-1]=num++;
            // 왼쪽으로 이동
            for(int j=end-2;j>=start;j--)
                answer[end-1][j]=num++;
            // 위쪽으로 이동
            for(int i=end-2;i>start;i--)
                answer[i][start]=num++;
            
            // 가장자리를 다 채워짐으로 인한 한칸 띄우기
            start++;
            end--;

        }

        return answer;
    }
}
